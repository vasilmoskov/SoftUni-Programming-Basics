package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME07SafePasswordsGenerator {
    public static void main(String[] args) {

        // 57/100

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int passCount = 0;

        boolean isFinished = false;

        for (char A = 35; A <= 56; A++) {
            if (isFinished) {
                break;
            }
            if (A > 55) {
                A = 35;
            }
            for (char B = 64; B <= 97; B++) {
                if (isFinished) {
                    break;
                }
                if (B > 96) {
                    B = 64;
                }
                for (int x = 1; x <= a; x++) {
                    if (isFinished) {
                        break;
                    }
                    for (int y = 1; y <= b; y++) {
                        if (isFinished) {
                            break;
                        }
                        passCount++;
                        if (passCount <= maxPasswords) {
                            System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                            if (x==a && y==b) {
                                isFinished = true;
                            }
                            A++;
                            B++;
                        } else {
                            isFinished = true;
                        }
                    }
                }
            }
        }
    }
}
