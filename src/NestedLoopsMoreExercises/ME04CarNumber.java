package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME04CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        for (int firstNumber = startInterval; firstNumber <= endInterval; firstNumber++) {
            for (int secondNumber = startInterval; secondNumber <= endInterval; secondNumber++) {
                for (int thirdNumber = startInterval; thirdNumber <= endInterval; thirdNumber++) {
                    for (int forthNumber = startInterval; forthNumber <= endInterval; forthNumber++) {
                        if ((firstNumber % 2 == 0 && forthNumber % 2 != 0) || (firstNumber % 2 != 0 && forthNumber % 2 == 0)) {
                            if (firstNumber > forthNumber) {
                                if ((secondNumber + thirdNumber) % 2 == 0) {
                                    System.out.printf("%d%d%d%d ", firstNumber, secondNumber, thirdNumber, forthNumber);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
