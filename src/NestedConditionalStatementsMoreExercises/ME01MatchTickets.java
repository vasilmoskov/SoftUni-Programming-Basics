package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME01MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String categoryTicket = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double priceTicket = 0.00;
        double transportCosts = 0.00;

        switch (categoryTicket) {
            case "VIP":
                priceTicket = 499.99;
                break;
            case "Normal":
                priceTicket = 249.99;
                break;
        }

        if (peopleCount >= 1 && peopleCount <=4) {
            transportCosts = budget * 0.75;
        } else if (peopleCount <= 9) {
            transportCosts = budget * 0.60;
        } else if (peopleCount <= 24) {
            transportCosts = budget * 0.50;
        } else if (peopleCount <= 49) {
            transportCosts = budget * 0.40;
        } else if (peopleCount > 50) {
            transportCosts = budget * 0.25;
        }

        double ticketCosts = priceTicket * peopleCount;
        double costs = transportCosts + ticketCosts;

        if (budget >= costs) {
            double leftMoney = budget - costs;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double neededMoney = costs - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}
