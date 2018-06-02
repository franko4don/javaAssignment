package com.company;

import java.util.*;

public class Main {

    static Scanner sc;
    static double percentage = 0.1;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter Loan amount to be collected and press Enter");
        double loanAmount = sc.nextDouble();
        double payback = (loanAmount * percentage) + loanAmount;
        System.out.println("You are to pay back "+ payback);
    }

}
