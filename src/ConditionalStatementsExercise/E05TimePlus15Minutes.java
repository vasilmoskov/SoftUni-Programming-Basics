package ConditionalStatementsExercise;

import java.util.Scanner;

public class E05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = hours * 60;
        int totalInMinutes = minutes + hoursInMinutes + 15;
        int totalInHours = totalInMinutes / 60;
        int restMinutes = totalInMinutes % 60;

        if (totalInHours == 24) {
            totalInHours =0;
            System.out.printf("%d:%02d", totalInHours, restMinutes);
        } else {
            System.out.printf("%d:%02d", totalInHours, restMinutes);
        }
    }
}
