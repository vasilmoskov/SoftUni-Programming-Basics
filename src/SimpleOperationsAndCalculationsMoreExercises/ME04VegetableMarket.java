package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class ME04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double profitBGN = priceKgFruits * totalKgFruits + priceKgVegetables * totalKgVegetables;
        double profitEuro = profitBGN / 1.94;

        System.out.printf("%.2f", profitEuro);

    }
}
