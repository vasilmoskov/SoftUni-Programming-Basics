package ForLoopMoreExercises;

import java.util.Scanner;

public class ME05GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int roundsOfTheGame = Integer.parseInt(scanner.nextLine());

        double points = 0;

        int from0To9Count = 0;
        int from10To19Count = 0;
        int from20To29Count = 0;
        int from30To39Count = 0;
        int from40To50Count = 0;
        int invalidCount = 0;

        for (int i = 1; i <= roundsOfTheGame; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());


            if (currentNumber >= 0 && currentNumber < 10) {
                points += currentNumber * 0.2;
                from0To9Count++;
            } else if (currentNumber >= 10 && currentNumber < 20) {
                points += currentNumber * 0.3;
                from10To19Count++;
            } else if (currentNumber >= 20 && currentNumber < 30) {
                points += currentNumber * 0.4;
                from20To29Count++;
            } else if (currentNumber >= 30 && currentNumber < 40) {
                points += 50;
                from30To39Count++;
            } else if (currentNumber >= 40 && currentNumber <= 50) {
                points += 100;
                from40To50Count++;
            } else {
                points /= 2;
                invalidCount++;
            }
        }

        double percent0To9 = 1.0 * from0To9Count / roundsOfTheGame * 100;
        double percent10To19 = 1.0 * from10To19Count / roundsOfTheGame * 100;
        double percent20To39 = 1.0 * from20To29Count / roundsOfTheGame * 100;
        double percent30To39 = 1.0 * from30To39Count / roundsOfTheGame * 100;
        double percent40To50 = 1.0 * from40To50Count / roundsOfTheGame * 100;
        double percentInvalidNumbers = 1.0 * invalidCount / roundsOfTheGame * 100;

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", percent0To9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10To19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20To39);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30To39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40To50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalidNumbers);

    }
}