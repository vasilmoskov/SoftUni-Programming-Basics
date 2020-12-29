package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int bright = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int sizeAquarium = length * bright * height;
        double litersTaken = sizeAquarium * 0.001;
        double litersNeeded = litersTaken * (100 - percent) / 100;

        System.out.printf("%.2f", litersNeeded);

    }
}
