package ForLoopMoreExercises;

import java.util.Scanner;

public class ME02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int checkedPatients = 0;
        int uncheckedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patientCount = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (checkedPatients < uncheckedPatients) {
                    doctors += 1;
                }
            }
            if (doctors >= patientCount) {
                checkedPatients += patientCount;
            } else {
                checkedPatients += doctors;
                int uncheckedPatientsForTheDay = patientCount - doctors;
                uncheckedPatients += uncheckedPatientsForTheDay;
            }
        }

        System.out.println("Treated patients: " + checkedPatients + ".");
        System.out.println("Untreated patients: " + uncheckedPatients + ".");
    }
}