package FirstStepsInCodingExercise;

import java.util.Scanner;

public class E05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallRental = Integer.parseInt(scanner.nextLine());

        double cake = hallRental * 0.2;
        double drinks = cake * 0.55;
        double animator = 1.0 * hallRental / 3;

        double budget = hallRental + cake + drinks + animator;

        System.out.println(budget);
    }
}
