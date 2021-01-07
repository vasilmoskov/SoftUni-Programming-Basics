package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class L13SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt (scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;

        double price = 0.00;

        switch (roomType) {
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                price = nights * 25.00;
                if (days < 10) {
                    price *= 0.7;
                } else if (days <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.5;
                }
                break;
            case "president apartment":
                price = nights * 35.00;
                if (days < 10) {
                    price *= 0.9;
                } else if (days <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.8;
                }
                break;
        }

        switch (rating) {
            case "positive":
                price *= 1.25;
                break;
            case "negative":
                price *= 0.9;
                break;
        }
        System.out.printf("%.2f", price);
    }
}
