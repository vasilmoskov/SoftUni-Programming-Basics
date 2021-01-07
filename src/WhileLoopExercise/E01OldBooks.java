package WhileLoopExercise;

import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int checkedBooks = 0;
        boolean isNotFound = false;

        while (!currentBook.equals(bookName)) {
            if (currentBook.equals("No More Books")) {
                isNotFound = true;
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", checkedBooks);
                break;
            }
            checkedBooks++;
            currentBook = scanner.nextLine();
        }

        if (!isNotFound) {
            System.out.printf("You checked %d books and found it.", checkedBooks);
        }
    }
}