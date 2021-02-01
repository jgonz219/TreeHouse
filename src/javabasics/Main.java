package javabasics;

import java.util.Scanner;

public class Main {
    public static final int PRICE = 99;

    public static void main(String[] args) {
        int numPurchased = promptUser();
        double discount = getDiscount(numPurchased);
        double totalDiscounted = getTotalDiscounted(numPurchased, discount);
        double total = getTotal(totalDiscounted, numPurchased);

        System.out.printf("Total Before Discount: %d %n" +
                "Total Discounted: %f %n" +
                "Total: %f %n", PRICE * numPurchased, totalDiscounted, total);
    }

    public static int promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of packages purchased:   ");
        return in.nextInt();
    }

    public static double getDiscount(int numPurchased) {
        if (numPurchased >= 50) {
            return 0.50;
        } else if (numPurchased >= 20) {
            return 0.30;
        } else if (numPurchased >= 10) {
            return 0.20;
        } else {
            return 0.0;
        }
    }

    public static double getTotalDiscounted(int numPurchased, double discount) {
        return (PRICE * numPurchased) * discount;
    }

    public static double getTotal(double totalDiscounted, int numPurchased) {
        return (PRICE * numPurchased) - totalDiscounted;
    }
}

