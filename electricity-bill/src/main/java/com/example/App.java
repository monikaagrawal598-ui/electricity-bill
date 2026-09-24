package com.example;

import java.util.Scanner;

public class App {

    public static double calculateBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } 
        else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();

        double bill = calculateBill(units);

        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: Rs. " + bill);

        scanner.close();
    }
}