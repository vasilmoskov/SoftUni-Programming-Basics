package FirstStepsInCodingLab;

import java.util.Scanner;

public class L07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int NumbersOfProjects = Integer.parseInt(scanner.nextLine());
        int hours = NumbersOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, NumbersOfProjects);

    }
}
