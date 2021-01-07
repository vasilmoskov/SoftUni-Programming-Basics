package NestedLoopsExercise;

import java.util.Scanner;

public class E04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        double currentPresentationMark = 0;
        double totalMark = 0;
        double averageMarkCurrentPresentation = 0;
        int assessmentCounter = 0;

        while (!input.equals("Finish")) {
            String presentation = input;
            for (int i = 1; i <= juryCount; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                assessmentCounter++;
                currentPresentationMark += mark;
                totalMark += mark;
            }
            averageMarkCurrentPresentation = currentPresentationMark / juryCount;
            System.out.printf("%s - %.2f.%n", presentation, averageMarkCurrentPresentation);
            currentPresentationMark = 0;
            input = scanner.nextLine();

        }
        double averageTotal = totalMark / assessmentCounter;
        System.out.printf("Student's final assessment is %.2f.", averageTotal);

    }
}