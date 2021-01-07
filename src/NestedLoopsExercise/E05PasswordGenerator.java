package NestedLoopsExercise;

import java.util.Scanner;

public class E05PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int firstCharacter = 1; firstCharacter <= n; firstCharacter++) {
            for (int secondCharacter = 1; secondCharacter <= n; secondCharacter++) {
                for (char thirdCharacter = 'a'; thirdCharacter < 'a' + l; thirdCharacter++) {
                    for (char forthCharacter = 'a'; forthCharacter < 'a' + l; forthCharacter++) {
                        for (int fifthCharacter = 1; fifthCharacter <= n; fifthCharacter++) {
                            if (fifthCharacter > firstCharacter && fifthCharacter > secondCharacter) {
                                System.out.printf("%d%d%c%c%d ", firstCharacter, secondCharacter, thirdCharacter, forthCharacter, fifthCharacter);
                            }
                        }
                    }
                }
            }
        }
    }
}