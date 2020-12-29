package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int daysNumber = Integer.parseInt(scanner.nextLine());

        double hoursPerDay = 1.0 * bookPages / pages / daysNumber;
        System.out.printf("%.0f", hoursPerDay);
    }
}