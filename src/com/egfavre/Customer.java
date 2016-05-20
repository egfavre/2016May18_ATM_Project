package com.egfavre;

/**
 * Created by user on 5/18/16.
 */
public class Customer {
    static String name;
    String transact;
    int transNum;

    public static void enterName() throws Exception {
        System.out.println("Please enter you name.");

        name = Main.scanner.nextLine();

        if (name.length() == 0) {
            throw new Exception("Invalid Name");
        }
    }

    public static double createAccount(Double customerBalance, String customerName, Double customerDeposit) {
        while (customerBalance == null) {
            System.out.println("You do not currently have an account.  Would you like to open a new account today?[Y/N]");
            String newAccount = Main.scanner.nextLine();
            if (newAccount.equalsIgnoreCase("Y")) {
                System.out.println("How much would you like to deposit today? [example: 200.00]");
                customerDeposit = Main.scanner.nextDouble();
            }
            else {
                customerName = "end";
            }
            return customerDeposit;
        }
        return customerDeposit;
    }

    public static void enterTransaction(Double customerBalance) throws Exception {

        System.out.println("Select the number of the transaction would you like to complete today?");
        System.out.println("1. Check Blance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        String transact = Main.scanner.nextLine();

        int transNum = Integer.valueOf(transact);

        //While loop to send back to start if canceled- use a break statement

        if (transNum == 1) {
            System.out.println("You have choosen "  + transact + "'check balance'.");

            System.out.println("Your Balance is $" + customerBalance);
        }
        else if (transNum == 3) {
            System.out.println("You have choosen " + transact + "'cancel.'");
            System.out.println("Thank you and come again!");
            //end program, loop to start with break statement
        }
        else if (transNum == 2) {
            System.out.println("You have choosen " + transact + "'withdrawl'.");

            //show account balance
            //how much to withdraw
            //is want > have; Yes: not valid, loop to transaction type; No: take money & loop to transaction type

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

        //add option 4- remove account

        else {
            throw new Exception("invalid transaction choice");
        }

    }



}
