package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME08SecretDoorsLock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hundredsUpper = Integer.parseInt(scanner.nextLine());
        int tensUpper = Integer.parseInt(scanner.nextLine());
        int onesUpper = Integer.parseInt(scanner.nextLine());

        for (int hundred = 1; hundred <= hundredsUpper; hundred++) {
            for (int ten = 1; ten <= tensUpper; ten++) {
                for (int one = 1; one <= onesUpper; one++) {
                    if (hundred % 2 == 0 && one % 2 == 0 && isPrime(ten)) {
                        System.out.printf("%d %d %d%n", hundred, ten, one);
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
