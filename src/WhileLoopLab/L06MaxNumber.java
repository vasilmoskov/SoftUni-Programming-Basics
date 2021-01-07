package WhileLoopLab;

import java.util.Scanner;

public class L06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int highestNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > highestNumber) {
                highestNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(highestNumber);
    }
}
