package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input code and days
        System.out.print("Enter code and days overdue: ");
        int code = sc.nextInt();
        int days = sc.nextInt();

        int fine = 0;
        boolean validCode = true;

        switch (code) {
            case 1:
                fine = days * 1; // $1 per day
                break;
            case 2:
                fine = days * 2; // $2 per day
                break;
            case 3:
                fine = days * 5; // $5 per day
                break;
            default:
                validCode = false;
                break;
        }

        if (validCode) {
            System.out.println(fine);
        } else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
