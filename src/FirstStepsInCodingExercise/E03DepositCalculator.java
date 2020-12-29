package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositDuration = Integer.parseInt(scanner.nextLine());
        double annualPercent = Double.parseDouble(scanner.nextLine());

        double finalSum = depositSum + depositDuration * ((depositSum * annualPercent / 100) / 12);
        System.out.println(finalSum);
    }
}
