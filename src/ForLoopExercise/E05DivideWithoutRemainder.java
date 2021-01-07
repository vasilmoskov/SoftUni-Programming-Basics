package ForLoopExercise;

import java.util.Scanner;

public class E05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt (scanner.nextLine());
            if (currentNumber % 2 ==0) {
                p1++;
            }
            if (currentNumber % 3 == 0) {
                p2++;
            }
            if (currentNumber % 4 == 0) {
                p3++;
            }
        }

        double p1InPercent = 1.0 * p1 / n * 100;
        double p2InPercent = 1.0 * p2 / n * 100;
        double p3InPercent = 1.0 * p3 / n * 100;

        System.out.printf("%.2f%%%n", p1InPercent);
        System.out.printf("%.2f%%%n", p2InPercent);
        System.out.printf("%.2f%%", p3InPercent);
    }
}