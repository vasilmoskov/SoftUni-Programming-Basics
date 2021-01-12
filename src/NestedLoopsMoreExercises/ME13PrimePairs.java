package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME13PrimePairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startingAmountFirstPair = Integer.parseInt(scanner.nextLine());
        int startingAmountSecondPair = Integer.parseInt(scanner.nextLine());
        int diffStartingAndFinishingAmountFirstPair = Integer.parseInt(scanner.nextLine());
        int diffStartingAndFinishingAmountSecondPair = Integer.parseInt(scanner.nextLine());

        int finishingAmountFirstPair = startingAmountFirstPair + diffStartingAndFinishingAmountFirstPair;
        int finishingAmountSecondPair = startingAmountSecondPair + diffStartingAndFinishingAmountSecondPair;

        for (int firstPair = startingAmountFirstPair; firstPair <= finishingAmountFirstPair; firstPair++) {
            for (int secondPair = startingAmountSecondPair; secondPair <= finishingAmountSecondPair; secondPair++) {
                if (isPrime(firstPair) && isPrime(secondPair)) {
                    System.out.printf("%d%d", firstPair, secondPair);
                    System.out.println();
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}