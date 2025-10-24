package com.codegnan.assignmentquestionday9;

import java.util.Scanner;

public class CanteenSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed prices
        final int PRICE_TEA = 10;
        final int PRICE_COFFEE = 15;
        final int PRICE_SAMOSA = 20;
        final double TAX_RATE = 0.05;

        // Quantities ordered
        int qtyTea = 0, qtyCoffee = 0, qtySamosa = 0;

        while (true) {
            System.out.println("\n||=========== CANTEEN MENU ===========||");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Checkout and Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // View menu
                    System.out.println("\n--- MENU ---");
                    System.out.println("1. Tea     - ₹" + PRICE_TEA);
                    System.out.println("2. Coffee  - ₹" + PRICE_COFFEE);
                    System.out.println("3. Samosa  - ₹" + PRICE_SAMOSA);
                    break;

                case 2:
                    // Order items
                    System.out.print("Enter item number to order (1-3): ");
                    int item = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (qty <= 0) {
                        System.out.println("Quantity must be greater than 0.");
                        break;
                    }

                    switch (item) {
                        case 1:
                            qtyTea += qty;
                            System.out.println(qty + " Tea(s) added.");
                            break;
                        case 2:
                            qtyCoffee += qty;
                            System.out.println(qty + " Coffee(s) added.");
                            break;
                        case 3:
                            qtySamosa += qty;
                            System.out.println(qty + " Samosa(s) added.");
                            break;
                        default:
                            System.out.println("Invalid item number.");
                            break;
                    }
                    break;

                case 3:
                    // View bill
                    int subtotal = qtyTea * PRICE_TEA + qtyCoffee * PRICE_COFFEE + qtySamosa * PRICE_SAMOSA;
                    double tax = subtotal * TAX_RATE;
                    double total = subtotal + tax;

                    System.out.println("\n--- BILL ---");
                    if (qtyTea > 0) System.out.println("Tea x" + qtyTea + " = ₹" + (qtyTea * PRICE_TEA));
                    if (qtyCoffee > 0) System.out.println("Coffee x" + qtyCoffee + " = ₹" + (qtyCoffee * PRICE_COFFEE));
                    if (qtySamosa > 0) System.out.println("Samosa x" + qtySamosa + " = ₹" + (qtySamosa * PRICE_SAMOSA));
                    System.out.println("Subtotal = ₹" + subtotal);
                    System.out.println("Tax (5%) = ₹" + tax);
                    System.out.println("Total = ₹" + total);
                    break;

                case 4:
                    // Checkout and exit
                    System.out.println("Thank you! Exiting system");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
                    break;
            }
        }
    }
}
