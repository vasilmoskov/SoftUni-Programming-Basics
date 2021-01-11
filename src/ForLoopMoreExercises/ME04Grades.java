package ForLoopMoreExercises;

import java.util.Scanner;

public class ME04Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt (scanner.nextLine());

        double gradeTotal = 0;
        int failedStudents= 0;
        int students3To4= 0;
        int students5To6= 0;
        int students4To5= 0;

        for (int i = 1; i <= studentsCount; i++) {
            double gradeCurrentStudent = Double.parseDouble (scanner.nextLine());
            gradeTotal += gradeCurrentStudent;
            if (gradeCurrentStudent >= 2.00 && gradeCurrentStudent < 3.00) {
                failedStudents ++;
            } else if (gradeCurrentStudent < 4.00) {
                students3To4 ++;
            } else if (gradeCurrentStudent < 5.00) {
                students4To5++;
            } else if (gradeCurrentStudent <= 6.00) {
                students5To6++;
            }
        }

        double percent2To3 = 1.0 * failedStudents / studentsCount * 100;
        double percent3To4 = 1.0 * students3To4 / studentsCount * 100;
        double percent4To5 = 1.0 * students4To5 / studentsCount * 100;
        double percent5To6 = 1.0 * students5To6 / studentsCount * 100;
        double averageGrade = gradeTotal / studentsCount;

        System.out.printf("Top students: %.2f%%%n", percent5To6);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent4To5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent3To4);
        System.out.printf("Fail: %.2f%%%n", percent2To3);
        System.out.printf("Average: %.2f", averageGrade);

    }
}
