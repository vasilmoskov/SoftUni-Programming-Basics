package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolies = Integer.parseInt(scanner.nextLine());
        int zyumbyuls = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double sumFlowers = magnolies * 3.25 + zyumbyuls * 4 + roses * 3.50 + cactuses * 8;
        double profitAfterTaxes = sumFlowers * 0.95;

        if (presentPrice > profitAfterTaxes) {
            double moneyToBorrow = Math.ceil(presentPrice - profitAfterTaxes);
            System.out.printf("She will have to borrow %.0f leva.", moneyToBorrow);
        } else {
            double moneyLeft = Math.floor(profitAfterTaxes - presentPrice);
            System.out.printf("She is left with %.0f leva.", moneyLeft);
        }
    }
}