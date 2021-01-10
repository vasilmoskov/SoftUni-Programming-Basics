package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME03Flowers {
    public static void main(String[] args) {

        // 75/100

        Scanner scanner = new Scanner(System.in);
        int chrisantemsCount = Integer.parseInt (scanner.nextLine());
        int rosesCount = Integer.parseInt (scanner.nextLine());
        int lulisCount = Integer.parseInt (scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrisantemsPrice = 0.0;
        double rosesPrice = 0.0;
        double lulisPrice = 0.0;
        double priceBucket = 0.0;
        double priceBucketAfterDiscount = 0.0;
        int totalFlowers = chrisantemsCount + lulisCount + rosesCount;

        switch (season) {
            case "Spring":
                chrisantemsPrice = 2.00;
                rosesPrice = 4.10;
                lulisPrice = 2.50;
                priceBucket = chrisantemsPrice * chrisantemsCount + rosesPrice * rosesCount + lulisCount * lulisPrice;
                if ("Y".equals(holiday)) {
                    priceBucket *= 1.15;
                }
                if (lulisCount > 7) {
                    priceBucketAfterDiscount = priceBucket * 0.95;
                }
                break;
            case "Summer":
                chrisantemsPrice = 2.00;
                rosesPrice = 4.10;
                lulisPrice = 2.50;
                priceBucket = chrisantemsPrice * chrisantemsCount + rosesPrice * rosesCount + lulisCount * lulisPrice;
                if ("Y".equals(holiday)) {
                    priceBucket *= 1.15;
                }
                priceBucketAfterDiscount = priceBucket;
                break;
            case "Autumn":
                chrisantemsPrice = 3.75;
                rosesPrice = 4.50;
                lulisPrice = 4.15;
                priceBucket = chrisantemsPrice * chrisantemsCount + rosesPrice * rosesCount + lulisCount * lulisPrice;
                if ("Y".equals(holiday)) {
                    priceBucket *= 1.15;
                }
                priceBucketAfterDiscount = priceBucket;
                break;
            case "Winter":
                chrisantemsPrice = 3.75;
                rosesPrice = 4.50;
                lulisPrice = 4.15;
                priceBucket = chrisantemsPrice * chrisantemsCount + rosesPrice * rosesCount + lulisCount * lulisPrice;
                if ("Y".equals(holiday)) {
                    priceBucket *= 1.15;
                }
                if (rosesCount >= 10) {
                    priceBucketAfterDiscount = priceBucket * 0.90;
                }
                break;
        }
        if (totalFlowers > 20) {
            priceBucketAfterDiscount *= 0.80;
        }

        double priceBucketTotal = priceBucketAfterDiscount + 2;
        System.out.printf("%.2f", priceBucketTotal);

    }
}
