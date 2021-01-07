package WhileLoopExercise;

import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalSteps = 0;

        while (!command.equals("Going home")) {
            int currentSteps = Integer.parseInt(command);
            totalSteps += currentSteps;
            if (totalSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", totalSteps - 10000);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt (scanner.nextLine());
            totalSteps += stepsToHome;
            if (totalSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", totalSteps - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
            }
        }
    }
}