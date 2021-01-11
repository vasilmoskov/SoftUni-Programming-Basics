package ForLoopMoreExercises;

import java.util.Scanner;

public class ME06Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt (scanner.nextLine());

        double waterBill = 20.00;
        double internetBill = 15.00;
        double electricityBillTotal = 0;
        double othersTotal = 0;

        for (int i = 1; i <= months; i++) {

            double electricityBill = Double.parseDouble (scanner.nextLine());

            electricityBillTotal += electricityBill;

            double others = (waterBill + internetBill + electricityBill) * 1.2;
            othersTotal += others;
        }

        double waterBillTotal = waterBill * months;
        double internetBillTotal = internetBill * months;

        double average = (electricityBillTotal + internetBillTotal + othersTotal + waterBillTotal) / months;

        System.out.printf("Electricity: %.2f lv%n", electricityBillTotal);
        System.out.printf("Water: %.2f lv%n", waterBillTotal);
        System.out.printf("Internet: %.2f lv%n", internetBillTotal);
        System.out.printf("Other: %.2f lv%n", othersTotal);
        System.out.printf("Average: %.2f lv", average);

    }
}