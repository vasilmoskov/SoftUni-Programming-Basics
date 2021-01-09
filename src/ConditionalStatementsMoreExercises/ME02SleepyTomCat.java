package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME02SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt (scanner.nextLine());

        int norm = 30000;

        int workingDays = 365 - restDays;

        int playingTimeInMinutes = restDays * 127 + workingDays * 63;

        if (playingTimeInMinutes > norm) {
            int differenceToNorm = playingTimeInMinutes - norm;
            int playingTimeInHours = differenceToNorm / 60;
            int restMinutes = differenceToNorm % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", playingTimeInHours, restMinutes);
        } else {
            int differenceToNorm = norm - playingTimeInMinutes;
            int playingTimeInHours = differenceToNorm / 60;
            int restMinutes = differenceToNorm % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", playingTimeInHours, restMinutes);
        }
    }
}