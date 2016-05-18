package com.egfavre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the ATM.");
        System.out.println("Please enter you name.");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.length() == 0) {
            throw new Exception("Invalid Name");
        }

        System.out.println("Welcome, " + name);
        System.out.println("Select the number of the transaction would you like to complete today?");
        System.out.println("1. Check Blance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        String transact = scanner.nextLine();

        System.out.println("You have choosen " + transact);
        int transNum = Integer.valueOf(transact);

        if (transNum == 1) {
            System.out.println("Your Balance is $100.00");
        }
        else if (transNum == 3) {
            System.out.println("Thank you and come again!");
        }
        else if (transNum == 2) {
            System.out.println("How much would you like to withdraw?");

            String withdrawlAmount = scanner.nextLine();

            double amount = Double.valueOf(withdrawlAmount);

            if (100 < amount){
                throw new Exception("Cannot complete transaction");
            }
            else {
                System.out.println("Please take your money.");
            }
        }
        else {
            throw new Exception("invalid transaction choice");
        }

        System.out.println("Have a nice day!");

    }
}
