package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class E06OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = number1 + number2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", number1, number2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", number1, number2, sum);
                }
                break;
            case "-":
                int substraction = number1 - number2;
                if (substraction % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", number1, number2, substraction);
                } else {
                    System.out.printf("%d - %d = %d - odd", number1, number2, substraction);
                }
                break;
            case "*":
                int product = number1 * number2;
                if (product % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", number1, number2, product);
                } else {
                    System.out.printf("%d * %d = %d - odd", number1, number2, product);
                }
                break;
            case "/":
                if (number2 != 0) {
                    double division = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                } else {
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                break;
            case "%":
                if (number2 != 0) {
                    int modulDivision = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, modulDivision);
                } else {
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                break;

        }
    }
}