package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price of the product");
        double unitprice = sc.nextDouble();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        double percent = percentage(quantity);
        double totalAmount = (unitprice * quantity) - (percent * unitprice * quantity);
        System.out.println("Total amount to be paid is : ₦ " + totalAmount+" after giving a discount of "+ (percent * 100) +"%");
//         DivisorSquareSum divide = new DivisorSquareSum();
//         divide.calculate();
    }



    public static double percentage(int quantity){
        double percent = 0;

        if(quantity >= 300 && quantity <= 500){
            percent = 0.05;
        }


        if(quantity > 500 && quantity <= 2000){
            percent = 0.1;
        }

        if(quantity > 2000){
            percent = 0.15;
        }


        return percent;
    }
}
