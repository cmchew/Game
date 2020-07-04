/*
Ask user to enter quantities for pennies, nickles, dimes, quarters
Count number of coins entered and calculate value of coins entered
If value  == $1 print you win
If value > $1 print how much they went over.
If valyue > $1 print how much they went under.
 */


import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //Initialize known values
        double penniesValue = .01;
        double nickelsValue = .05;
        double dimesValue = .10;
        double quartersValue = .25;
        double gameWin = 1.00;

        //Get unknown values
        System.out.println("Enter the number of pennies in your pocket:");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Enter the number of nickels in your pocket:");
        int nickels = scanner.nextInt();

        System.out.println("Enter the nunber of dimes in your pocket:");
        int dimes = scanner.nextInt();

        System.out.println("Enter the number of quarters in your pocket:");
        int quarters = scanner.nextInt();

        //Multiply coins by amount.
        double totalPennies = pennies * penniesValue;
        double totalNickels = nickels * nickelsValue;
        double totalDimes = dimes * dimesValue;
        double totalQuarters = quarters * quartersValue;

        double totalChange = totalPennies + totalNickels + totalDimes + totalQuarters;

        //Display results
        System.out.println("You have " + totalPennies + " in pennies.");
        System.out.println("You have " + totalNickels + " in nickels.");
        System.out.println("You have " + totalDimes + " in dimes.");
        System.out.println("You have " + totalQuarters + " in quarters.");

        System.out.println("You have " + totalChange + " in total change.");

        //Decision


        //Output
        if(totalChange == gameWin) {
            System.out.println("Your total change is " + totalChange + ". You win!");
        }
        else if (totalChange > gameWin) {
            double totalOver = totalChange - gameWin;
            System.out.println("Your total change is " + totalChange + ". You are over by " + totalOver + ".");
        }
        else if (totalChange < gameWin){
            double totalUnder = gameWin - totalChange;
            System.out.println("Your total change is " + totalChange + "You are under by" + totalUnder + ".");
        }



    }

}
