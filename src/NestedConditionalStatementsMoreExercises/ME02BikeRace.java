package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME02BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int juniorRidersCount = Integer.parseInt (scanner.nextLine());
        int seniorRidersCount = Integer.parseInt (scanner.nextLine());
        String typeOfRoad = scanner.nextLine();

        double price = 0.0;

        switch (typeOfRoad) {
            case "trail":
                price = juniorRidersCount * 5.50 + seniorRidersCount * 7.00;
                break;
            case "cross-country":
                price = juniorRidersCount * 8.00 + seniorRidersCount * 9.50;
                if (juniorRidersCount + seniorRidersCount >= 50) {
                    price *= 0.75;
                }
                break;
            case "downhill":
                price = juniorRidersCount * 12.25 + seniorRidersCount * 13.75;
                break;
            case "road":
                price = juniorRidersCount * 20.00 + seniorRidersCount * 21.50;
                break;
        }

        price *= 0.95;
        System.out.printf("%.2f", price);
    }
}