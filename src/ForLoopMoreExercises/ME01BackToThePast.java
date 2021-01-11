package ForLoopMoreExercises;

import java.util.Scanner;

public class ME01BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble (scanner.nextLine());
        int yearToLiveTo = Integer.parseInt (scanner.nextLine());

        int expensesFromEvenYears = 0;

        for (int i = 1800; i <= yearToLiveTo; i+=2) {
            expensesFromEvenYears += 12000;
        }

        int expensesFromOddYears = 0;
        int age=19;

        for (int i = 1801; i <= yearToLiveTo; i+=2) {

            expensesFromOddYears += (12000 + 50 * age);
            age+=2;
        }

        int totalExpenses = expensesFromEvenYears + expensesFromOddYears;

        if (inheritedMoney >= totalExpenses) {
            double leftMoney = inheritedMoney - totalExpenses;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", leftMoney);
        } else {
            double neededMoney = totalExpenses - inheritedMoney;
            System.out.printf("He will need %.2f dollars to survive.", neededMoney);
        }
    }
}