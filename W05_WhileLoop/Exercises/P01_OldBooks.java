package W05_WhileLoop.Exercises;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        String input = scanner.nextLine();

        int count = 0;
        boolean wasFound = false;
        while (!input.equals("No More Books")){

            if (wantedBook.equals(input)){
                wasFound = true;

                break;
            }
            count++;

            input = scanner.nextLine();
        }

        if (wasFound) {
            System.out.printf("You checked %d books and found it.", count);

        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }


    }
}
