package ConditionalStatementsAdvancedLabAndExercise;

import java.util.Scanner;

public class E08OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hourOfTheExam = Integer.parseInt(scanner.nextLine());
        int minuteOfTheExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());

        int hourExamInMinutes = hourOfTheExam * 60;
        int sumMinutesExam = hourExamInMinutes + minuteOfTheExam;

        int hourArrivalInMinutes = hourOfArrival * 60;
        int sumMinutesArrival = hourArrivalInMinutes + minuteOfArrival;

        if (sumMinutesArrival > sumMinutesExam) {
            int minutesAfterTheExam = sumMinutesArrival - sumMinutesExam;
            if (minutesAfterTheExam < 60) {
                System.out.printf("Late%n%d minutes after the start", minutesAfterTheExam);
            } else {
                int hoursAfterTheExam = minutesAfterTheExam / 60;
                int restMinutesAfterTheExam = minutesAfterTheExam % 60;
                System.out.printf("Late%n%d:%02d hours after the start", hoursAfterTheExam, restMinutesAfterTheExam);
            }
        } else if (sumMinutesExam - sumMinutesArrival > 30) {
            int minutesBeforeTheExam = sumMinutesExam - sumMinutesArrival;
            if (minutesBeforeTheExam > 30 && minutesBeforeTheExam < 60) {
                System.out.printf("Early%n%d minutes before the start", minutesBeforeTheExam);
            } else if (minutesBeforeTheExam >= 60) {
                int hoursBeforeTheExam = minutesBeforeTheExam / 60;
                int restMinutesBeforeTheExam = minutesBeforeTheExam % 60;
                System.out.printf("Early%n%d:%02d hours before the start", hoursBeforeTheExam, restMinutesBeforeTheExam);
            }
        } else {
            int minutesBeforeTheExam = sumMinutesExam - sumMinutesArrival;
            if (minutesBeforeTheExam == 0) {
                System.out.println("On time");
            } else {
                System.out.printf("On time%n%d minutes before the start", minutesBeforeTheExam);
            }
        }
    }
}


