package WhileLoopLab;

import java.util.Scanner;

public class L08GraduationPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;

        double sumMarks = 0;
        int failsCount = 0;

        boolean hasGraduated = true;

        while (grade <= 12) {
            double mark = Double.parseDouble(scanner.nextLine());

            if (mark < 4) {
                failsCount++;
                if (failsCount == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    hasGraduated = false;
                    break;
                }
                continue;
            }
            grade++;
            sumMarks += mark;
        }
        if (hasGraduated) {
            double average = sumMarks / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}