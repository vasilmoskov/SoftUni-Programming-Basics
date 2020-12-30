package ConditionalStatementsExercise;

import java.util.Scanner;

public class E01SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int competitor1 = Integer.parseInt(scanner.nextLine());
        int competitor2 = Integer.parseInt(scanner.nextLine());
        int competitor3 = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = competitor1 + competitor2 + competitor3;

        int totalTimeMinutes = totalTimeSeconds / 60;
        int restTimeSeconds = totalTimeSeconds % 60;

        if (restTimeSeconds < 10) {
            System.out.printf("%d:%02d", totalTimeMinutes, restTimeSeconds);
        } else {
            System.out.printf("%d:%d", totalTimeMinutes, restTimeSeconds);
        }
    }
}