package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt (scanner.nextLine());
        int P1 = Integer.parseInt (scanner.nextLine());
        int P2 = Integer.parseInt (scanner.nextLine());
        double H = Double.parseDouble (scanner.nextLine());

        double filledByPipe1 = P1 * H;
        double filledByPipe2 = P2 * H;
        double filledTotal = filledByPipe1 + filledByPipe2;

        if (filledTotal <= V) {
            double percentageFilled = filledTotal / V * 100.0;
            double percentageP1 = filledByPipe1 / filledTotal * 100.0;
            double percentageP2 = filledByPipe2 / filledTotal * 100.0;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentageFilled, percentageP1, percentageP2);
        } else {
            double overflewed = filledTotal - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, overflewed);
        }
    }
}