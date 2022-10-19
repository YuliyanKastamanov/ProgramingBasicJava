package W04_ForLoop.Exercises;

import java.util.Scanner;

public class P03_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddMin = 999999999.9;
        double oddMax = -999999999.9;
        double oddSum = 0;

        double evenMin = 999999999.9;
        double evenMax = -999999999.9;
        double evenSum = 0;

        for (int number = 1; number <=n ; number++) {
            double value = Double.parseDouble(scanner.nextLine());

            if (number % 2 == 0){
                evenSum += value;
                if (value>evenMax){
                    evenMax=value;
                }
                if(value<evenMin){
                    evenMin=value;
                }

            }else {  //ако позицията е нечетна
                oddSum += value;
                if(value>oddMax){
                    oddMax=value;
                }
                if (value<oddMin){
                    oddMin=value;
                }
            }



        }

        System.out.printf("OddSum=%.2f,%n",oddSum);

        if (oddMin == 999999999.9) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        }
        if (oddMax == -999999999.9) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if (evenMin == 999999999.9) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        }
        if (evenMax == -999999999.9) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }







    }
}
