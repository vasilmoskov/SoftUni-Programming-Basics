package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME06WeddingSeats {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.next().charAt(0);
        int rowsNumberFirstSector = scanner.nextInt();
        int placesNumberOddRow = scanner.nextInt();

        int rowsCurrentSector = rowsNumberFirstSector;
        int placesCurrentRow = placesNumberOddRow;
        int placesCount = 0;

        for (char sector = 'A'; sector <= lastSector; sector++){
            for (int row = 1; row <= rowsCurrentSector; row++){
                if (row%2==0) {
                    placesCurrentRow +=2;
                }
                for (char place = 'a'; place < 'a' + placesCurrentRow; place++) {
                    placesCount++;
                    System.out.printf("%c%d%c%n", sector, row, place);
                }
                placesCurrentRow = placesNumberOddRow;

            }
            rowsCurrentSector++;
        }
        System.out.println(placesCount);
    }
}