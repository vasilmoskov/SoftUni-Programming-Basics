package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble (scanner.nextLine());

        double priceForKm = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    priceForKm = 0.75;
                } else if (kmPerMonth <= 10000) {
                    priceForKm = 0.95;
                } else if (kmPerMonth <= 20000) {
                    priceForKm = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    priceForKm = 0.90;
                } else if (kmPerMonth <= 10000) {
                    priceForKm = 1.10;
                } else if (kmPerMonth <= 20000) {
                    priceForKm = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    priceForKm = 1.05;
                } else if (kmPerMonth <= 10000) {
                    priceForKm = 1.25;
                } else if (kmPerMonth <= 20000) {
                    priceForKm = 1.45;
                }
        }

        double salary = priceForKm * kmPerMonth * 4;
        double taxes = salary * 0.10;
        double netSalary = salary - taxes;

        System.out.printf("%.2f", netSalary);
    }
}