package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME05ChallengeTheWedding {
    public static void main(String[] args) {

        // 30/100

        Scanner scanner = new Scanner(System.in);
        int menNumber = Integer.parseInt(scanner.nextLine());
        int womenNumber = Integer.parseInt(scanner.nextLine());
        int tablesNumber = Integer.parseInt(scanner.nextLine());

        boolean allTablesTaken = false;

        for (int i = 1; i <= menNumber; i++) {
            if (allTablesTaken) {
                break;
            }
            for (int j = 1; j <= womenNumber; j++) {
                    if (i + j <= tablesNumber && tablesNumber <=100) {
                        System.out.printf("(%d <-> %d) ", i, j);
                    } else {
                        allTablesTaken = true;
                        break;
                    }
            }
        }
    }
}