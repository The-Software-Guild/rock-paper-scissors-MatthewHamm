/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        //Variable declartions
        Scanner myScanner=new Scanner(System.in);
        
        String playerChoice;
        String computerChoice;
        
        int noRounds;
        int currRound=0;

        int wins=0;
        int losses=0;
        int draws=0;
        
        String replay;
        
        //Asks user how many round they want to play
        System.out.println("How many round do you want to play?(1-10)");
        noRounds=Integer.parseInt(myScanner.nextLine());
        
        //Ends program if the inputed value is out of range
        if(noRounds<1 || noRounds>10){
            System.out.println("This number isn't between 1 and 10");
        }
        else{
            //run game loop while the current round is less than the number of round inputted by the user
            while(noRounds>currRound){
                //increments the current round
                currRound++;
                //Asks the user for rock paper or scissors
                System.err.println("Rock, paper or scissors");
                playerChoice=myScanner.nextLine();
                //generate the computers choice
                computerChoice=generateComputerChoice();
                
                //if the choices are the same it's a draw
                if(playerChoice.equalsIgnoreCase(computerChoice)){
                    System.err.println("Draw! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    draws++;
                }
                //if the player wins
                else if((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                        (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")||(
                        playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")))){
                    System.err.println("Player Wins! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    wins++;
                }
                // if the player doesn't draw or win it loses
                else{
                    System.err.println("Computer Wins! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    losses++;
                }
            }
            //if the player wins more than loses they win
            if(wins>losses){
                System.out.println("Player won the most rounds! The player had Wins: "+wins+" Losses: "+losses+" Draw: "+draws);
            }
            //if the player loses more than win they win
            else if(losses>wins){
                System.out.println("Computer won the most rounds! The player had Wins: "+wins+" Losses: "+losses+" Draw: "+draws);
            }
            //if they have the same number of win and draws. It is a draw
            else{
                System.out.println("It was a draw! The player had Wins: "+wins+" Losses: "+losses+" Draw: "+draws);
            }
            //asks they user if it wants to play again
            System.out.println("Do you want to play again? ");
            replay=myScanner.nextLine();
            //if it does it calls the main function to restart the program
            if(replay.equalsIgnoreCase("Yes")){
                main(args);
            }
        }
        
    }
    public static String generateComputerChoice(){
        //Varibles declared
        Random randomiser =new Random();
        int numericChoice;
        //Gets a random integer
        numericChoice=randomiser.nextInt(3)+1;
        //returns a choice based on the random integer
        switch(numericChoice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }
}
