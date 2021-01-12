package NestedLoopsMoreExercises;

import java.util.Scanner;

public class ME12TheSongOfTheWheels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;

        boolean passwordFound = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if (a * b + c * d == M && M <= 144) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                counter++;

                                if (counter == 4) {
                                    digit1 = a;
                                    digit2 = b;
                                    digit3 = c;
                                    digit4 = d;
                                    passwordFound = true;
                                }

                            }
                        }

                    }
                }
            }
        }
        System.out.println();
        if (passwordFound) {
            System.out.printf("Password: %d%d%d%d", digit1, digit2, digit3, digit4);
        } else {
            System.out.println("No!");
        }
    }
}