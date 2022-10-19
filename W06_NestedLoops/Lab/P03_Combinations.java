package W06_NestedLoops.Lab;

import java.util.Scanner;

public class P03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int validCombinationCount = 0;

        for (int x1 = 0; x1 <=number ; x1++) {
            for (int x2 = 0; x2 <=number ; x2++) {
                for (int x3 = 0; x3 <=number ; x3++) {

                    if (x1 + x2 + x3 == number){
                        validCombinationCount++;

                    }


                }

            }

        }
        System.out.println(validCombinationCount);

    }
}
