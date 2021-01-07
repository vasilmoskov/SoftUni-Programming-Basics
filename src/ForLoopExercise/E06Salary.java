package ForLoopExercise;

import java.util.Scanner;

public class E06Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int facebookFine = 150;
        int instagramFine = 100;
        int redditFine = 50;

        for (int i = 1; i <= n; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case "Facebook":
                    salary -= facebookFine;
                    break;
                case "Instagram":
                    salary -= instagramFine;
                    break;
                case "Reddit":
                    salary -= redditFine;
                    break;
            }
            if (salary <= 0) {
                break;
            }

        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}