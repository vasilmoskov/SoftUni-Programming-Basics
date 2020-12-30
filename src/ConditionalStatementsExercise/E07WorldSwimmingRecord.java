package ConditionalStatementsExercise;

import java.util.Scanner;

public class E07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble (scanner.nextLine());
        double distanceInMeters = Double.parseDouble (scanner.nextLine());
        double timeInSecondsForOneMeter = Double.parseDouble (scanner.nextLine());

        double timesDelay= Math.floor(distanceInMeters / 15);


        double timeIvan = distanceInMeters * timeInSecondsForOneMeter + 12.5 * timesDelay;

        if (timeIvan< recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeIvan - recordInSeconds);
        }

    }
}
