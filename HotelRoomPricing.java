package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class HotelRoomPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input room type and season
        System.out.print("Enter room type and season: ");
        int room = sc.nextInt();
        int season = sc.nextInt();

        String price = "";

        switch (room) {
            case 1: // Standard
                if (season == 1) { // Peak
                    price = "$100";
                } else if (season == 2) { // Off-Peak
                    price = "$80";
                } else {
                    price = "Invalid Input";
                }
                break;

            case 2: // Deluxe
                if (season == 1) { // Peak
                    price = "$200";
                } else if (season == 2) { // Off-Peak
                    price = "$150";
                } else {
                    price = "Invalid Input";
                }
                break;

            default:
                price = "Invalid Input";
                break;
        }

        System.out.println(price);
        sc.close();
    }
}
