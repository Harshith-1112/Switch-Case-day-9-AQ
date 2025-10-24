package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class WeatherAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input condition code and temperature
        System.out.print("Enter condition code and temperature: ");
        int code = sc.nextInt();
        int temp = sc.nextInt();

        String alert;

        switch (code) {
            case 1:
                alert = "Sunny";
                break;
            case 2:
                alert = "Rainy";
                break;
            case 3:
                if (temp < 10) {
                    alert = "Severe Warning";
                } else {
                    alert = "Stormy";
                }
                break;
            default:
                alert = "Invalid Condition";
                break;
        }

        System.out.println(alert);
        sc.close();
    }
}
