package com.egfavre;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Double customerDeposit = 0.0;

        Double customerBalance;

        int transNum = 0;

        HashMap<String, Double> accounts = new HashMap<>();

        //Set up HashMap
        accounts.put("Abigail", 5999.35);
        accounts.put("Benjamin", 76459.83);
        accounts.put("Catherine", 85.45);
        accounts.put("David", 2.02);
        accounts.put("Eugene", 1.75);
        accounts.put("Fisher", 345.23);
        accounts.put("Georgia", 25375.34);
        accounts.put("Harriette", 43.45);
        accounts.put("Ingrid", 234.34);
        accounts.put("Jefferson", 234.23);
        accounts.put("Kevin", 3453.23);
        accounts.put("Laura", 234.56);
        accounts.put("Monica", 9834.34);
        accounts.put("Newman", 234.34);
        accounts.put("Owen", 9834539745829374.34);

        //Test accounts works:
        //Double test = accounts.get("Marcus");
        //System.out.println(test);
        //result = "null"


        //Start: Welcome and collect name:
        System.out.println("Welcome to the ATM.");

        Customer customer = new Customer();
        customer.enterName();
        String customerName = Customer.name;
        customerBalance = accounts.get(customerName);

        Customer.createAccount(customerBalance, customerName, customerDeposit);
        accounts.put(customerName, customerBalance);

        while (customerName != "end" && transNum != 3) {
            System.out.println("Welcome, " + customer.name);
            customer.enterTransaction();
        }

        System.out.println("Have a nice day!");
    }
}