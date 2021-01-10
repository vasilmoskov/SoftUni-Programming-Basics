package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME04CarToGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double price = 0.0;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        } else {
            carClass = "Luxury class";
            switch (season) {
                case "Summer":
                case "Winter":
                    carType = "Jeep";
                    price = budget * 0.90;
                    break;

            }
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, price);
    }
}