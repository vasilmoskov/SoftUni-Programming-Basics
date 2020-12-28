package FirstStepsInCodingLab;

import java.util.Scanner;

public class L09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double qm = Double.parseDouble(scanner.nextLine());
        double price = qm * 7.61;
        double discount = price * 18/100;
        double FinalPrice = price - discount;
        System.out.println("The final price is: " + FinalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
