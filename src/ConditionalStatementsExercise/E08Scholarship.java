package ConditionalStatementsExercise;

import java.util.Scanner;

public class E08Scholarship {

    // 93/100

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double averageMark = Double.parseDouble(scanner.nextLine());
        double minimumSalary = Double.parseDouble(scanner.nextLine());

        boolean rightForSocialScholarship = false;
        boolean rightForSuccessScholarship = false;

        double socialScholarship = 0;
        double successScholarship = 0;

        if (income < minimumSalary && averageMark > 4.5) {
            rightForSocialScholarship = true;
            socialScholarship = Math.floor(0.35 * minimumSalary);
        }

        if (averageMark > 5.5) {
            rightForSuccessScholarship = true;
            successScholarship = Math.floor(averageMark * 25);
        }

        if (!rightForSocialScholarship && !rightForSuccessScholarship) {
            System.out.println("You cannot get a scholarship!");
        }
        if (rightForSocialScholarship && socialScholarship > successScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        }
        if (rightForSuccessScholarship && successScholarship >= socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", successScholarship);
        }
    }
}
