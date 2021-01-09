package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME03Harvest {
    public static void main(String[] args) {

        // 80/100

        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt (scanner.nextLine());
        double Y = Double.parseDouble (scanner.nextLine());
        int Z = Integer.parseInt (scanner.nextLine());
        int numberWorkers = Integer.parseInt (scanner.nextLine());

        double grapesTotal = X * Y;
        double wine = grapesTotal * 0.4 / 2.5;

        if (wine > Z) {
            wine = Math.floor(grapesTotal * 0.4 / 2.5);
            double rest = Math.ceil(wine - Z);
            double litersPerPerson = Math.ceil(rest / numberWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", rest, litersPerPerson);
        } else {
            wine = grapesTotal * 0.4 / 2.5;
            double missing = Math.floor(Z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", missing);
        }
    }
}