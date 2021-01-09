package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME05Firm {
    public static void main(String[] args) {

        // 90/100

        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt (scanner.nextLine());
        int daysAvailable = Integer.parseInt (scanner.nextLine());
        int employeesWorkingExtra = Integer.parseInt (scanner.nextLine());

        double training = daysAvailable * 0.1;
        double hoursAvailable = (daysAvailable - training) * 8;

        double hoursByEmployeesThatWorkExtra = employeesWorkingExtra * 2 * daysAvailable;

        double totalHours = Math.floor(hoursByEmployeesThatWorkExtra + hoursAvailable);

        if (totalHours > hoursNeeded) {
            double hoursLeft = totalHours - hoursNeeded;
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else {
            double hoursNotEnough = hoursNeeded - totalHours;
            System.out.printf("Not enough time!%.0f hours needed.", hoursNotEnough);
        }
    }
}
