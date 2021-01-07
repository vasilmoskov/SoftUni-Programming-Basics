package WhileLoopLab;

import java.util.Scanner;

public class L02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accountName = scanner.nextLine();
        String password = scanner.nextLine();
        String currentTry = scanner.nextLine();

        while (!currentTry.equals(password)) {
            currentTry = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", accountName);
    }
}