package WhileLoopExercise;

import java.util.Scanner;

public class E06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int cakePieces = cakeLength * cakeWidth;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int takenPieces = Integer.parseInt(command);
            cakePieces -= takenPieces;
            if (cakePieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("STOP")) {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
