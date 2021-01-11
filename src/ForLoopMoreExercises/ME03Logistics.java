package ForLoopMoreExercises;

import java.util.Scanner;

public class ME03Logistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int loadsCount = Integer.parseInt(scanner.nextLine());

        int priceForTon = 0;
        int priceBus = 0;
        int priceTruck = 0;
        int priceTrain = 0;

        int busTons = 0;
        int truckTons = 0;
        int trainTons = 0;

        int totalTons = 0;

        for (int i = 1; i <= loadsCount; i++) {
            int tonsOfCurrentLoad = Integer.parseInt(scanner.nextLine());

            totalTons += tonsOfCurrentLoad;

            if (tonsOfCurrentLoad <= 3) {
                priceForTon = 200;
                busTons += tonsOfCurrentLoad;
                priceBus += priceForTon * tonsOfCurrentLoad;
            } else if (tonsOfCurrentLoad <= 11) {
                priceForTon = 175;
                truckTons += tonsOfCurrentLoad;
                priceTruck += priceForTon * tonsOfCurrentLoad;
            } else {
                priceForTon = 120;
                trainTons += tonsOfCurrentLoad;
                priceTrain += priceForTon * tonsOfCurrentLoad;
            }
        }

        double averagePrice = 1.0 * (priceBus + priceTrain + priceTruck) / totalTons;
        double procentTonsBus = 100.0 * busTons / totalTons;
        double procentTonsTruck = 100.0 * truckTons / totalTons;
        double procentTonsTrain = 100.0 * trainTons / totalTons;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", procentTonsBus);
        System.out.printf("%.2f%%%n", procentTonsTruck);
        System.out.printf("%.2f%%%n", procentTonsTrain);

    }
}