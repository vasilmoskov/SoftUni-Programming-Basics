package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double quantityBananas = Double.parseDouble(scanner.nextLine());
        double quantityOranges = Double.parseDouble(scanner.nextLine());
        double quantityRaspberries = Double.parseDouble(scanner.nextLine());
        double quantityStrawberries = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries * 0.5;
        double priceOranges = priceRaspberries * 0.6;
        double priceBananas = priceRaspberries * 0.2;

        double sum = priceBananas * quantityBananas + priceOranges * quantityOranges + priceRaspberries * quantityRaspberries + priceStrawberries * quantityStrawberries;
        System.out.printf("%.2f", sum);
    }
}
