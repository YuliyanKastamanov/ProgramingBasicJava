package W06_NestedLoops.Exercises;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        for (int i = number1; i <=number2 ; i++) {


            int currentNum = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j >= 1 ; j--) {

                int digit = currentNum % 10;

                if (j % 2 == 0){
                    evenSum += digit;
                }else {
                    oddSum += digit;

                }

            currentNum = currentNum / 10;
            }


            if(evenSum == oddSum){
                System.out.print(i + " ");
            }


        }
    }
}
