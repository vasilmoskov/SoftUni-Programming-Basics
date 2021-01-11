package ForLoopMoreExercises;

import java.util.Scanner;

public class ME07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansTotalCount = Integer.parseInt(scanner.nextLine());

        int fansOf1Team = 0;
        int fansOf2Team = 0;

        int fansInSectorA = 0;
        int fansInSectorB = 0;
        int fansInSectorV = 0;
        int fansInSectorG = 0;

        for (int i = 1; i <= fansTotalCount; i ++) {
            String sectorOfCurrentFan = scanner.nextLine();
            switch (sectorOfCurrentFan) {
                case "A":
                    fansInSectorA++;
                    break;
                case "B":
                    fansInSectorB++;
                    break;
                case "V":
                    fansInSectorV++;
                    break;
                case "G":
                    fansInSectorG++;
                    break;
            }
        }

        double procentFansSectorA = 1.0 * fansInSectorA / fansTotalCount * 100;
        double procentFansSectorB = 1.0 * fansInSectorB / fansTotalCount * 100;
        double procentFansSectorV = 1.0 * fansInSectorV / fansTotalCount * 100;
        double procentFansSectorG = 1.0 * fansInSectorG / fansTotalCount * 100;

        double procentTotalFans = 1.0 * fansTotalCount / stadiumCapacity * 100;


        System.out.printf("%.2f%%%n", procentFansSectorA);
        System.out.printf("%.2f%%%n", procentFansSectorB);
        System.out.printf("%.2f%%%n", procentFansSectorV);
        System.out.printf("%.2f%%%n", procentFansSectorG);
        System.out.printf("%.2f%%%n", procentTotalFans);

    }
}