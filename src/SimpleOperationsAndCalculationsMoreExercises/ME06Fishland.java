package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class ME06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceScumriaKg = Double.parseDouble (scanner.nextLine());;
        double priceCacaKg = Double.parseDouble (scanner.nextLine());;
        double palamudKg = Double.parseDouble (scanner.nextLine());;
        double safridKg = Double.parseDouble (scanner.nextLine());;
        int shellsKg = Integer.parseInt (scanner.nextLine());;

        double pricePalamugKg = priceScumriaKg * 1.6;
        double priceSafridKg = priceCacaKg * 1.8;
        double priceShellsKg = 7.50;

        double totalPrice = palamudKg * pricePalamugKg + safridKg * priceSafridKg + shellsKg * priceShellsKg;
        System.out.printf("%.2f", totalPrice);
    }
}
