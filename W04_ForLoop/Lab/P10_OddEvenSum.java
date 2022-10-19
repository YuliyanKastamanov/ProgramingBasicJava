package W04_ForLoop.Lab;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEvenPositions = 0; // сума на числата на четни позиции.
        int sumOddPositions = 0; //сума на числата на нечетни позиции.

        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            //ако позицията е нечетна
            if (number % 2 == 1){
                sumOddPositions += value;

            }else {  //ако позицията е четна
                sumEvenPositions += value;
            }
        }
        if (sumEvenPositions == sumOddPositions){
            System.out.println("Yes");
            System.out.println("Sum = " + sumEvenPositions);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEvenPositions - sumOddPositions));

        }


    }
}
