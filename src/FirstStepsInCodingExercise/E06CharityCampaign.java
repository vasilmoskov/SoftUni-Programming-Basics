package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCampaign = Integer.parseInt(scanner.nextLine());
        int numberBakers = Integer.parseInt(scanner.nextLine());
        int numberCakes = Integer.parseInt(scanner.nextLine());
        int numberWaffles = Integer.parseInt(scanner.nextLine());
        int numberPancakes = Integer.parseInt(scanner.nextLine());

        int priceCake = numberCakes * 45;
        double priceWaffles = numberWaffles * 5.80;
        double pricePancakes = numberPancakes * 3.20;

        double profit = daysCampaign * numberBakers* (priceCake + pricePancakes + priceWaffles);
        double expenses = profit / 8;

        double finalAmount = profit - expenses;
        System.out.printf("%.2f", finalAmount);
    }
}
