package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME03LuckyNumbers {
    public static void main(String[] args) {

        //10/100 time limit

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= N; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= N; secondDigit++) {
                for (int thirdDigit = 1; thirdDigit <= N; thirdDigit++) {
                    for (int forthDigit = 1; forthDigit <= N; forthDigit++) {
                        if (firstDigit <= 9 && secondDigit <= 9 && thirdDigit <= 9 && forthDigit <= 9) {
                            if ((firstDigit + secondDigit == thirdDigit + forthDigit)) {
                                if (N % (firstDigit + secondDigit) == 0) {
                                    System.out.printf("%d%d%d%d ", firstDigit, secondDigit, thirdDigit, forthDigit);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
