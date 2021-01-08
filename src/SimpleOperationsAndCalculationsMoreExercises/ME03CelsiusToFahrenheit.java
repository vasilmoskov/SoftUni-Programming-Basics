package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class ME03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Celsius = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = Celsius * 9 / 5 + 32;
        System.out.printf("%.2f", Fahrenheit);
    }
}
