package WhileLoopExercise;

import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int allowedUnsatisfyingMarksCount = Integer.parseInt (scanner.nextLine());

        int unsatisfyingMarksCount = 0;

        int numberOfProblems = 0;
        String lastProblem = "";
        int marksSum = 0;
        double averageScore = 0;

        while (unsatisfyingMarksCount!=allowedUnsatisfyingMarksCount) {
            String taskName = scanner.nextLine();
            if (taskName.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", averageScore);
                System.out.printf("Number of problems: %d%n", numberOfProblems);
                System.out.printf("Last problem: %s", lastProblem);
                break;
            }
            numberOfProblems++;
            lastProblem = taskName;
            int mark = Integer.parseInt (scanner.nextLine());
            marksSum += mark;
            averageScore = 1.0 * marksSum / numberOfProblems;
            if (mark <= 4) {
                unsatisfyingMarksCount++;
            }

        }

        if (unsatisfyingMarksCount==allowedUnsatisfyingMarksCount) {
            System.out.printf("You need a break, %d poor grades.", unsatisfyingMarksCount);
        }
    }
}
