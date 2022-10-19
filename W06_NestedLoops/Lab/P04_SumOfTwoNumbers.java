package W06_NestedLoops.Lab;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFoundCombination = false;
        for (int number1 = startNumber; number1 <=endNumber ; number1++) {
            for (int number2 = startNumber; number2 <=endNumber ; number2++) {

                counter++;

                if (number1 + number2 == magicNumber){

                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNumber);
                    isFoundCombination = true;
                    return;



                }

            }
            
        }

        if(!isFoundCombination){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }

    }
}
