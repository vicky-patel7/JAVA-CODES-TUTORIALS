package com.company;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for Rock, 1 for Paper, 2 for Scissors
        System.out.print("Press 0 for Rock, 1 for Paper, 2 for Scissors : ");
        // Taking input from the user
        int userInput = sc.nextInt();
        // Let the computer generate a random number
        Random comp = new Random();
        int computerInput = comp.nextInt(3);
        System.out.println("Computer entered : " + computerInput );

        // Case 1 - Draw
        if (userInput == computerInput ) {
            System.out.println("It is a Draw ");
            // winning condition for the user
        }
        else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)){
            System.out.println("User wins");
            // winning condition for the computer
        }
        else if ((computerInput == 0 && userInput == 2) || (computerInput == 1 && userInput == 0) || (computerInput == 2 && userInput == 1)){
            System.out.println("computer wins");
        }
        else{
            System.out.println("Enter Valid input");
        }
        System.out.println("Thanks for playing the game");
    }
}

