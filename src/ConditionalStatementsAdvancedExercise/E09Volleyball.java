package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class E09Volleyball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeYear = scanner.nextLine();
        int holidaysNumber = Integer.parseInt(scanner.nextLine());
        int weekendsInHomeTown = Integer.parseInt(scanner.nextLine());

        double timesPlayedTotal = 0;
        double timesPlayedInHolidays = 1.0 * holidaysNumber * 2 / 3;
        double timesPlayedInHomeTown = 1.0 * weekendsInHomeTown;

        int weekendsInSofia = 48 - weekendsInHomeTown;
        double timesPlayedInSofia = 1.0 * weekendsInSofia * 3 / 4;

        timesPlayedTotal = timesPlayedInHolidays + timesPlayedInHomeTown + timesPlayedInSofia;

        if (typeYear.equals("leap")) {
            timesPlayedTotal *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(timesPlayedTotal));

    }
}
