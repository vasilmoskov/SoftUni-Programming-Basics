package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME10Profit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int oneLvCoinsNumber = Integer.parseInt(scanner.nextLine());
        int twoLvCoinsNumber = Integer.parseInt(scanner.nextLine());
        int fiveLvBanknotesNumber = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int oneLvCoins = 0; oneLvCoins <= oneLvCoinsNumber; oneLvCoins++) {
            for (int twoLvCoins = 0; twoLvCoins <= twoLvCoinsNumber; twoLvCoins++) {
                for (int fiveLvBanknotes = 0; fiveLvBanknotes <= fiveLvBanknotesNumber; fiveLvBanknotes++) {
                    if (oneLvCoins + 2 * twoLvCoins + 5 * fiveLvBanknotes == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", oneLvCoins, twoLvCoins, fiveLvBanknotes, sum);
                    }
                }
            }
        }
    }
}