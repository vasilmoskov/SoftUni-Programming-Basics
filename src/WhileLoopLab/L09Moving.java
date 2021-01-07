package WhileLoopLab;

import java.util.Scanner;

public class L09Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());

        int cubicMeters = widthFreeSpace * lengthFreeSpace * heightFreeSpace;

        int boxesSum = 0;

        String input = scanner.nextLine();

        boolean noSpace = false;

        while (!input.equals("Done")) {
            int currentBox = Integer.parseInt(input);
            boxesSum += currentBox;

            if (cubicMeters < boxesSum) {
                noSpace = true;
                int neededSpace = boxesSum - cubicMeters;
                System.out.printf("No more free space! You need %d Cubic meters more.", neededSpace);
                break;
            }
            input = scanner.nextLine();
        }
        if (!noSpace) {
            int rest = cubicMeters - boxesSum;
            System.out.printf("%d Cubic meters left.", rest);
        }
    }
}
