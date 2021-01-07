package ForLoopLab;

import java.util.Scanner;

public class L11CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt (scanner.nextLine());
        double laundryPrice = Double.parseDouble (scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        int moneyPresent = 0;
        int moneyFromBirthdays = 0;
        int moneyFromToys = 0;

        for (int i = 1; i <= ageLily; i+=2) {
            toysCount++;
        }

        for (int i = 2; i <= ageLily; i+=2) {
            moneyPresent += 10;
            moneyFromBirthdays += moneyPresent - 1;
        }

        moneyFromToys = toyPrice * toysCount;
        int totalSavedMoney = moneyFromBirthdays + moneyFromToys;

        if (totalSavedMoney >= laundryPrice) {
            double rest = totalSavedMoney - laundryPrice;
            System.out.printf("Yes! %.2f", rest);
        } else {
            double needed = laundryPrice - totalSavedMoney;
            System.out.printf("No! %.2f", needed);
        }

    }
}
