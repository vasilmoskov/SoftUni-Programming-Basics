package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String vacationType = "";
        String destination = "";
        double price = 0.00;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    vacationType = "Camp";
                    price = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    price = budget * 0.4;
                    vacationType = "Camp";
                } else {
                    destination = "Europe";
                    price = budget * 0.9;
                    vacationType = "Hotel";
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    price = budget * 0.7;
                    vacationType = "Hotel";
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    price = budget * 0.8;
                    vacationType = "Hotel";
                } else {
                    destination = "Europe";
                    price = budget * 0.9;
                    vacationType = "Hotel";
                }
                break;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, vacationType, price);
    }
}

