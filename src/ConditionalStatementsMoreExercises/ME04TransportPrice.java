package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME04TransportPrice {
    public static void main(String[] args) {

        // 83/100

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxiStartingTarrif = 0.70;
        double taxiDayTarrif = 0.79;
        double taxiNightTarrif = 0.90;

        double trainTarrif = 0.06;

        double busTarrif = 0.09;

        if (n < 20) {
            if (dayOrNight.equals("day")) {
                double price = taxiStartingTarrif + n * taxiDayTarrif;
                System.out.printf("%.2f", price);
            } else if (dayOrNight.equals("night")) {
                double price = taxiStartingTarrif + n * taxiNightTarrif;
                System.out.printf("%.2f", price);
            }

        } else if (n > 100) {
            double price = trainTarrif * n;
            System.out.printf("%.2f", price);
        } else {
            double price = n * busTarrif;
            System.out.printf("%.2f", price);
        }
    }
}
