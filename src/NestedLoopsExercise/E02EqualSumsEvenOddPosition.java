package NestedLoopsExercise;

import java.util.Scanner;

public class E02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt (scanner.nextLine());
        int number2 = Integer.parseInt (scanner.nextLine());

        for (int i = number1; i <= number2; i++){
            int ones = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i /100 % 10;
            int thousands = i /1000 % 10;
            int tenThousands = i /10000 % 10;
            int hundredThousands = i /100000;
            if (ones + hundreds + tenThousands == tens + thousands + hundredThousands){
                System.out.printf("%d ", i);
            }
        }
    }
}
