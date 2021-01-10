package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME05Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String accomodation = "";
        double price = 0;

        if (budget <= 1000) {
            accomodation = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.45;
                    break;
            }
        } else if (budget <= 3000) {
            accomodation = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.80;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.60;
                    break;
            }
        } else {
            accomodation = "Hotel";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.90;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", location, accomodation, price);

    }
}