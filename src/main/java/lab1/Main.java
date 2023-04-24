package lab1;


import java.util.Scanner;





public class Main {
    public static void main(String[] args) {



        Scanner userInput = new Scanner(System.in);
        double[] prices = {2.0, 5.0, 10.0, 15.0, 20.0};
        System.out.println("How many miles did you run?");
        double milesRan = userInput.nextInt();
        userInput.nextLine();
        if (milesRan <= 4.0) {
            System.out.println("you owe me $ " + prices[0]);
            System.out.println("\n");
        } else if (milesRan <= 15.0) {
            System.out.println("you owe $ " + prices[1]);
            }
        else if (milesRan <= 25.0) {
                    System.out.println("you owe $ " + prices[2]);}

        else if (milesRan <= 50.0) {
                        System.out.println("you owe $ " + prices[3]);}
        else {
            System.out.println("you owe $ " + prices[4]);}






            System.out.println("Enter product here: ");
            String product = userInput.nextLine();

            System.out.println("Enter quantity here: ");
            int quantity = userInput.nextInt();

        double costOfMilesRan = prices[0];
        if (milesRan <= 4.0) {
            costOfMilesRan = prices[0];
        } else if (milesRan <= 15.0) {
            costOfMilesRan = prices[1];
        } else if (milesRan <= 25.0) {
            costOfMilesRan = prices[2];
        } else if (milesRan <= 50.0) {
            costOfMilesRan = prices[3];
        } else {
            costOfMilesRan = prices[4];
        }

        double totalCost = (costOfMilesRan * quantity) + milesRan;


        /*
        %s: a placeholder for a string
        %d: a placeholder for an integer
        %f: a placeholder for a floating-point number (decimal)

         */

            System.out.println("Product     Qty      Price      Miles     Total   ");
            System.out.println("------      ---      -----      -----     -----   ");
            System.out.printf("%-10s %-10d %-10.2f %-10.2f %-10.2f", product, quantity, costOfMilesRan, milesRan, totalCost);




        }
    }
