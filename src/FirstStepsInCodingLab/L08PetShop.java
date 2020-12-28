package FirstStepsInCodingLab;

import java.util.Scanner;

public class L08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int others = Integer.parseInt(scanner.nextLine());
        double Costs1 = dogs * 2.50;
        int Costs2 = others * 4;
        System.out.println(Costs1 + Costs2);

    }
}
