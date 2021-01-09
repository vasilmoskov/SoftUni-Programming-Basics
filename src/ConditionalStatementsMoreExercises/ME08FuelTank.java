package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class ME08FuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());

        String fuel = "";
        boolean valid = true;
        switch (typeFuel) {
            case "Diesel":
                fuel = "diesel";
                break;
            case "Gasoline":
                fuel = "gasoline";
                break;
            case "Gas":
                fuel = "gas";
                break;
            default:
                valid = false;
                System.out.println("Invalid fuel!");
        }
        if (valid) {
            if (litersFuel >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else if (litersFuel < 25) {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        }
    }
}