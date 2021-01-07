package NestedLoopsLab;

import java.util.Scanner;

public class L05Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        double totalMoneySaved = 0;


        while (!destination.equals("End")) {
            double moneyNeeded = Double.parseDouble(scanner.nextLine());
            double moneySaved = Double.parseDouble(scanner.nextLine());
            while (moneyNeeded > totalMoneySaved) {
                totalMoneySaved += moneySaved;
                if (moneyNeeded <= totalMoneySaved){
                    System.out.printf("Going to %s!%n", destination);
                    totalMoneySaved = 0;
                    break;
                }
                moneySaved = Double.parseDouble (scanner.nextLine());
            }
            destination = scanner.nextLine();
        }
    }
}
