package ConditionalStatementsLab;

import java.util.Scanner;

public class L07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());

        int puzzlesN = Integer.parseInt(scanner.nextLine());
        int dollsN = Integer.parseInt(scanner.nextLine());
        int teddyBearsN = Integer.parseInt(scanner.nextLine());
        int minionsN = Integer.parseInt(scanner.nextLine());
        int camionsN = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double profit = puzzlesN * puzzlePrice + dollsN * dollPrice + teddyBearPrice * teddyBearsN + minionPrice * minionsN + truckPrice * camionsN;
        int totalN = puzzlesN + dollsN + teddyBearsN + minionsN + camionsN;

        double net = 0.0;
        if (totalN >= 50) {
            net = profit * 0.75;
        } else {
            net = profit;
        }
        double rental = net * 0.1;
        double finalProfit = net - rental;

        if (finalProfit >= excursionPrice) {
            net = finalProfit - excursionPrice;
            System.out.print("Yes! ");
            System.out.printf("%.2f", net);
            System.out.print(" lv left.");
        } else {
            net = (finalProfit - excursionPrice) * -1;
            System.out.print("Not enough money! ");
            System.out.printf("%.2f", net);
            System.out.print(" lv needed.");
        }

    }
}
