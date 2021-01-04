package ForLoopLabAndExercise;

import java.util.Scanner;

public class E03OddEvenPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double evenSum = 0;

        double oddSum = 0;
        double oddMax = Integer.MIN_VALUE;
        ;
        double oddMin = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += currentNumber;
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
            }
        }
        if (oddSum == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");

        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }

        if (evenSum == 0) {
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);


        }
    }
}

