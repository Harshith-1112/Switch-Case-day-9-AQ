package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class RegionTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input region code and income
        System.out.print("Enter region code and income: ");
        int code = sc.nextInt();
        int income = sc.nextInt();

        int tax = 0;
        boolean validRegion = true;

        switch (code) {
            case 1: // North
                tax = (int)(income * 0.05);
                break;
            case 2: // South
                tax = (int)(income * 0.06);
                break;
            case 3: // East
                tax = (int)(income * 0.07);
                break;
            case 4: // West
                tax = (int)(income * 0.08);
                break;
            default:
                validRegion = false;
                break;
        }

        if (validRegion) {
            System.out.println(tax);
        } else {
            System.out.println("Invalid Region");
        }

        sc.close();
    }
}
