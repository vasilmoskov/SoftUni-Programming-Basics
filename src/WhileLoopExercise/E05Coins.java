package WhileLoopExercise;

import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double remainder = Double.parseDouble (scanner.nextLine());

        double remainderInHundreds = Math.floor(remainder * 100);

        int coinsCounter = 0;

        while (remainderInHundreds > 0) {
            if (remainderInHundreds >= 200) {
                coinsCounter++;
                remainderInHundreds -= 200;
            } else if (remainderInHundreds >= 100) {
                coinsCounter++;
                remainderInHundreds -= 100;
            } else if (remainderInHundreds >= 50) {
                coinsCounter++;
                remainderInHundreds -= 50;
            }else if (remainderInHundreds >= 20) {
                coinsCounter++;
                remainderInHundreds -= 20;
            }else if (remainderInHundreds >= 10) {
                coinsCounter++;
                remainderInHundreds -= 10;
            }else if (remainderInHundreds >= 5) {
                coinsCounter++;
                remainderInHundreds -= 5;
            }else if (remainderInHundreds >= 2) {
                coinsCounter++;
                remainderInHundreds -= 2;
            }else if (remainderInHundreds >= 1) {
                coinsCounter++;
                remainderInHundreds -= 1;
            }
        }
        System.out.println(coinsCounter);

    }
}
