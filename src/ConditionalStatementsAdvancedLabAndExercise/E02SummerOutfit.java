package ConditionalStatementsAdvancedLabAndExercise;

import java.util.Scanner;

public class E02SummerOutfit {
    public static void main(String[] args) {

        // 90/100

        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt (scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (timeOfTheDay){
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Swim Suit";
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                break;


        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
