package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userScore = 0;
        int computerScore = 0;
       while (true) {
           System.out.print("\nEnter your choice (rock/paper/scissor): ");
        String YourChoice = sc.next().toLowerCase();
        System.out.println("Your Choice= "+YourChoice);
        int computerRandom = (int)(Math.random()*3);
        String computerChoice ="";
        if(computerRandom==0){
            computerChoice= "scissor";
        } else if(computerRandom==1){
            computerChoice="rock";
        } else{
            computerChoice="paper";
        }
        System.out.println("Computer Choice = "+computerChoice);
        if(YourChoice.equals(computerChoice)){
            System.out.println("Its tie!");
        } else if(YourChoice.equals("rock") && computerChoice.equals("scissor")||
                YourChoice.equals("scissor") && computerChoice.equals("paper")||
                YourChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("You won!");
            userScore++;
        } else{
            System.out.println("You lost!");
            computerScore++;
            }
                System.out.println("\nScoreboard:");
                System.out.println("You: " + userScore);
                System.out.println("Computer: " + computerScore);

                System.out.print("\nDo you want to play again? (yes/no): ");
                String again = sc.next().toLowerCase();
                if (!again.equals("yes")) {
                    System.out.println("\nFinal Score:");
                    System.out.println("You: " + userScore);
                    System.out.println("Computer: " + computerScore);
                    System.out.println("Thanks for playing! 👋");
                    break;
                }

        }
    }
}
