package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input role code and salary
        System.out.print("Enter role code and salary: ");
        int code = sc.nextInt();
        int salary = sc.nextInt();

        int bonus = 0;
        boolean validRole = true;

        switch (code) {
            case 1: // Manager
                bonus = (int)(salary * 0.10);
                break;
            case 2: // Developer
                bonus = (int)(salary * 0.05);
                break;
            case 3: // Intern
                bonus = 500;
                break;
            default:
                validRole = false;
                break;
        }

        if (validRole) {
            System.out.println(bonus);
        } else {
            System.out.println("Invalid Role");
        }

        sc.close();
    }
}
