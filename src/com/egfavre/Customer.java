package com.egfavre;

/**
 * Created by user on 5/18/16.
 */
public class Customer {
    String name;
    String transact;
    int transNum;

    public void enterName() throws Exception {
        System.out.println("Please enter you name.");

        name = Main.scanner.nextLine();

        if (name.length() == 0) {
            throw new Exception("Invalid Name");
        }
    }

    public static void enterTransaction() throws Exception {

        System.out.println("Select the number of the transaction would you like to complete today?");
        System.out.println("1. Check Blance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        String transact = Main.scanner.nextLine();

        int transNum = Integer.valueOf(transact);

        if (transNum == 1) {
            System.out.println("You have choosen "  + transact + "'check balance'.");
            System.out.println("Your Balance is $100.00");
        }
        else if (transNum == 3) {
            System.out.println("You have choosen " + transact + "'cancel.'");
            System.out.println("Thank you and come again!");
        }
        else if (transNum == 2) {
            System.out.println("You have choosen " + transact + "'withdrawl'.");
            System.out.println("How much would you like to withdraw?");

            String withdrawlAmount = Main.scanner.nextLine();

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

    }



}
