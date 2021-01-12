package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharacter = scanner.next().charAt(0);
        char lastCharacter = scanner.next().charAt(0);
        char skipCharacter = scanner.next().charAt(0);

        int counter = 0;

        for (char i = firstCharacter; i <= lastCharacter; i++) {
            for (char j = firstCharacter; j <= lastCharacter; j++) {
                for (char k = firstCharacter; k <= lastCharacter; k++) {
                    if (i != skipCharacter && j != skipCharacter && k != skipCharacter) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }

                }

            }

        }
        System.out.println(counter);
    }
}