package SimpleOperationsAndCalculationsMoreExercises;

import java.util.Scanner;

public class ME07HousePainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double houseHeightX = Double.parseDouble(scanner.nextLine());
        double lengthSideWallY = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = houseHeightX * lengthSideWallY;
        double window = 1.5 * 1.5;
        double twoSidesNet = 2 * (sideWall - window);

        double backSide = houseHeightX * houseHeightX;
        double entrance = 1.2 * 2;
        double backAndfrontSidesNet = 2 * backSide - entrance;

        double netSum = twoSidesNet + backAndfrontSidesNet;
        double litersGreenPaint = netSum / 3.4;
        System.out.printf("%.2f\n", litersGreenPaint);

        double rectanglesCap = 2 * houseHeightX * lengthSideWallY;
        double triangles = 2 * (houseHeightX * h / 2);
        double capNet = rectanglesCap + triangles;
        double litersRedPaint = capNet / 4.3;
        System.out.printf("%.2f", litersRedPaint);


    }
}

