package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME11HappyCatParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double pricePerHour = 0;
        double total = 0;
        double totalForTheDay = 0;

        for (int day = 1; day <= daysCount; day++) {
            for (int hour = 1; hour <= hoursPerDay; hour++) {
                if (day % 2 != 0 && hour % 2 == 0) {
                    pricePerHour = 1.25;
                    totalForTheDay += pricePerHour;
                    total += pricePerHour;
                } else if (day % 2 == 0 && hour % 2 != 0) {
                    pricePerHour = 2.50;
                    totalForTheDay += pricePerHour;
                    total += pricePerHour;
                } else {
                    pricePerHour = 1.00;
                    totalForTheDay += pricePerHour;
                    total += pricePerHour;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, totalForTheDay);
            totalForTheDay = 0;
        }
        System.out.printf("Total: %.2f leva", total);
    }
}