package WhileLoopLab;

import java.util.Scanner;

public class L07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lowestNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < lowestNumber) {
                lowestNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(lowestNumber);
    }
}
