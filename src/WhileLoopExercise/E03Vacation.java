package WhileLoopExercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        String action = "";
        double spentMoney = 0;
        double savedMoney = 0;

        int daysGone = 0;
        int consecutiveDaysOfSpending = 0;

        boolean neededMoneyReached = true;

        while (neededMoney > availableMoney) {
            action = scanner.nextLine();
            daysGone++;
            if (action.equals("spend")) {
                consecutiveDaysOfSpending++;
                if (consecutiveDaysOfSpending >= 5) {
                    neededMoneyReached = false;
                    break;
                }
                spentMoney = Double.parseDouble(scanner.nextLine());
                availableMoney -= spentMoney;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            } else if (action.equals("save")) {
                consecutiveDaysOfSpending = 0;
                savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += savedMoney;
            }
        }

        if (neededMoneyReached) {
            System.out.printf("You saved the money for %d days.", daysGone);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(daysGone);
        }
    }
}
