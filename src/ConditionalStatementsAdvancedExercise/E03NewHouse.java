package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class E03NewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt (scanner.nextLine());
        int budget = Integer.parseInt (scanner.nextLine());

        double price = 0.00;
        double total = 0.00;

        switch (flowersType) {
            case "Roses":
                price = 5.00;
                total = price * flowersCount;
                if (flowersCount > 80) {
                    total *= 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80;
                total = price * flowersCount;
                if (flowersCount > 90) {
                    total *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                total = price * flowersCount;
                if (flowersCount > 80) {
                    total *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00;
                total = price * flowersCount;
                if (flowersCount < 120) {
                    total *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                total = price * flowersCount;
                if (flowersCount < 80) {
                    total *= 1.20;
                }
                break;
        }

        if (budget >= total) {
            double restMoney = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, restMoney);
        } else {
            double neededMoney = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);

        }
    }
}
