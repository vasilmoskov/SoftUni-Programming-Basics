package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstUpper = Integer.parseInt(scan.nextLine());
        int secondUpper = Integer.parseInt(scan.nextLine());
        int thirdUpper = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= firstUpper; i++) {
            for (int j = 1; j <= secondUpper; j++) {
                for (int k = 1; k <= thirdUpper; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j >= 2 && j <= 7) {
                            if (isPrime(j)) {
                                System.out.printf("%d %d %d\n", i, j, k);
                            }
                        }
                    }
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