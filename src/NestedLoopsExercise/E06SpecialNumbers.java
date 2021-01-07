package NestedLoopsExercise;

import java.util.Scanner;

public class E06SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //1111 -> 9999
        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int forth = 1; forth <= 9; forth++) {
                        if(n % first == 0 && n % second == 0 && n % third == 0 && n % forth == 0) {
                            System.out.printf("%d%d%d%d ", first, second, third, forth);
                        }
                    }
                }
            }
        }
    }
}