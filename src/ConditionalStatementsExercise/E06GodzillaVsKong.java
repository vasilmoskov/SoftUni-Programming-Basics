package ConditionalStatementsExercise;

import java.util.Scanner;

public class E06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceClothesPerStatist = Double.parseDouble(scanner.nextLine());

        double priceClothesTotal = priceClothesPerStatist * numberStatists;
        double priceDecor = budget * 0.1;

        if (numberStatists > 150) {
            priceClothesTotal = priceClothesTotal * 0.9;
        } else {
            priceClothesTotal = priceClothesTotal;
        }

        double expenses = priceClothesTotal + priceDecor;

        if (expenses > budget) {
            double neededMoney = expenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
            double leftMoney = budget - expenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
