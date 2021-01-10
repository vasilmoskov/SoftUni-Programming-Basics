package NestedConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME07SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        pricePerNight = 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        pricePerNight = 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        pricePerNight = 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        pricePerNight = 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        pricePerNight = 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        pricePerNight = 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        pricePerNight = 15;
                        sport = "Football";
                        break;
                    case "girls":
                        pricePerNight = 15;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        pricePerNight = 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }

        if (studentsCount >= 50) {
            pricePerNight *= 0.50;
        } else if (studentsCount >= 20) {
            pricePerNight *= 0.85;
        } else if (studentsCount >= 10) {
            pricePerNight *= 0.95;
        }

        double totalPrice = nightsCount * pricePerNight * studentsCount;

        System.out.printf("%s %.2f lv.", sport, totalPrice);

    }
}