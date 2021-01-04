package ConditionalStatementsAdvancedLabAndExercise;

import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double priceApartmentPerNight = 0;
        double priceStudioPerNight = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudioPerNight = 50;
                priceApartmentPerNight = 65;
                if (nightsCount > 14) {
                    priceApartmentPerNight *= 0.9;
                    priceStudioPerNight *= 0.7;
                } else if (nightsCount > 7) {
                    priceStudioPerNight *= 0.95;
                }
                break;
            case "June":
            case "September":
                priceStudioPerNight = 75.20;
                priceApartmentPerNight = 68.70;
                if (nightsCount > 14) {
                    priceApartmentPerNight *= 0.9;
                    priceStudioPerNight *= 0.8;
                }
                break;
            case "July":
            case "August":
                priceStudioPerNight = 76.00;
                priceApartmentPerNight = 77.00;
                if (nightsCount > 14) {
                    priceApartmentPerNight *= 0.9;
                }
                break;
        }
        double totalApartment = priceApartmentPerNight * nightsCount;
        double totalStudio = priceStudioPerNight * nightsCount;

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", totalApartment, totalStudio);

    }
}