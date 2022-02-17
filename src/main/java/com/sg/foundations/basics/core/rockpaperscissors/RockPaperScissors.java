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
        Scanner myScanner=new Scanner(System.in);
        String playerChoice;
        int numericChoice;
        String computerChoice;
        int noRounds;
        int currRound=0;
        Random randomiser =new Random();
        int wins=0;
        int losses=0;
        int draws=0;
        
        System.out.println("How many round do you want to play?(1-10)");
        noRounds=Integer.parseInt(myScanner.nextLine());
        if(noRounds<1 || noRounds>10){
            System.out.println("This number isn't between 1 and 10");
        }
        else{
            while(noRounds>currRound){
                currRound++;
                System.err.println("Rock, paper, scissors");
                playerChoice=myScanner.nextLine();
                numericChoice=randomiser.nextInt(3)+1;
                
                
                switch(numericChoice){
                    case 1:
                        computerChoice="Rock";
                        break;
                    case 2:
                        computerChoice="Paper";
                        break;
                    case 3:
                        computerChoice="Scissors";
                        break;
                    default:
                        computerChoice="";
                        break;
                }
                
                
                if(playerChoice.equalsIgnoreCase(computerChoice)){
                    System.err.println("Draw! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    draws++;
                }
                else if((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                        (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")||(
                        playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")))){
                    System.err.println("Player Wins! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    wins++;
                }else{
                    System.err.println("Computer Wins! Player choice "+ playerChoice+" Computer choice "+computerChoice);
                    losses++;
                }
            }
            
        }
        
    }
}
