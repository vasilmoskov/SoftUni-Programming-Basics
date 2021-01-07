package NestedLoopsExercise;

import java.util.Scanner;

public class E03SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;
        int wholeNumber = 0;
        int devider = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
            }
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    devider++;
                }
            }
            if (devider == 2) {
                sumPrime += number;
            }
            if (devider > 2) {
                sumNonPrime += number;
            }
            devider = 0;
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
