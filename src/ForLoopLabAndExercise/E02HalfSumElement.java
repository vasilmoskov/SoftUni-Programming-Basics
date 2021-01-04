package ForLoopLabAndExercise;

import java.util.Scanner;

public class E02HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int highestNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;
            }
        }

        int sumOthers = sum - highestNumber;

        if (highestNumber == sumOthers) {
            System.out.println("Yes");
            System.out.println("Sum = " + highestNumber);
        } else {
            int diff = Math.abs(highestNumber - sumOthers);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}