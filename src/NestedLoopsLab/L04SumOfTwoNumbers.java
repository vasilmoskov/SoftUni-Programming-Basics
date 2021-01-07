package NestedLoopsLab;

import java.util.Scanner;

public class L04SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int combinationCount = 0;

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int i = begin; i <= end; i++) {
            if (isFound) {
                break;
            }
            for (int j = begin; j <= end; j++) {
                combinationCount++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCount, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNumber);
        }
    }
}
