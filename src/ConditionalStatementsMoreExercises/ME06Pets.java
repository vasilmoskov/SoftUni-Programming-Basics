package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME06Pets {
    public static void main(String[] args) {

        // 90/100

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt (scanner.nextLine());
        int foodLeftInKg = Integer.parseInt (scanner.nextLine());
        double foodPerDayForTheDogInKg = Double.parseDouble (scanner.nextLine());
        double foodPerDayForTheCatInKg = Double.parseDouble (scanner.nextLine());
        double foodPerDayForTheTurtleInG = Double.parseDouble (scanner.nextLine());

        double neededFoodForTheDog = days * foodPerDayForTheDogInKg;
        double neededFoodForTheCat = days * foodPerDayForTheCatInKg;
        double neededFoodForTheTurtle = days * foodPerDayForTheTurtleInG / 1000;

        double foodTotal = neededFoodForTheCat + neededFoodForTheDog + neededFoodForTheTurtle;

        if (foodTotal < foodLeftInKg) {
            double foodInTheEnd = Math.floor(foodLeftInKg - foodTotal);
            System.out.printf("%.0f kilos of food left.", foodInTheEnd);
        } else if (foodTotal > foodLeftInKg) {
            double foodInTheEnd = Math.ceil(foodTotal - foodLeftInKg);
            System.out.printf("%.0f more kilos of food are needed.", foodInTheEnd);
        }
    }
}
