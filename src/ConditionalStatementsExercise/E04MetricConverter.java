package ConditionalStatementsExercise;

import java.util.Scanner;

public class E04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();



        if (input.equals("m")) {
            if (output.equals("cm")) {
                double solution = number * 100;
                System.out.printf("%.3f", solution);
            } else if (output.equals("mm")) {
                double solution = number * 1000;
                System.out.printf("%.3f", solution);
            }
        } else if (input.equals("mm")) {
            if (output.equals("cm")) {
                double solution = number / 10;
                System.out.printf("%.3f", solution);
            } else if (output.equals("m")) {
                double solution = number / 1000;
                System.out.printf("%.3f", solution);
            }
        } else if (input.equals("cm")) {
            if (output.equals("mm")) {
                double solution = number * 10;
                System.out.printf("%.3f", solution);
            } else if (output.equals("m")) {
                double solution = number / 100;
                System.out.printf("%.3f", solution);
            }
        }
    }
}
