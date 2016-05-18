package com.egfavre;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the ATM.");

        Customer customer = new Customer();

        customer.enterName();

        System.out.println("Welcome, " + customer.name);

        customer.enterTransaction();

        System.out.println("Have a nice day!");

    }
}
