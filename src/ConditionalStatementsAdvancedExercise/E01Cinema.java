package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int r = Integer.parseInt (scanner.nextLine());
        int c = Integer.parseInt (scanner.nextLine());

        double price = 0.00;

        switch (projectionType) {
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
        }

        double profit = c * r * price;

        System.out.printf("%.2f%nleva", profit);

    }
}