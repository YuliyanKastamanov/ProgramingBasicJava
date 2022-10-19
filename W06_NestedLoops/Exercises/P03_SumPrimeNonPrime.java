package W06_NestedLoops.Exercises;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrimeNumber = 0;
        int sumNonPrimeNumber = 0;

        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            boolean isPrime = true;

            if (number < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i <=number - 1 ; i++) {


                if(number % i == 0){
                    sumNonPrimeNumber +=number;
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sumPrimeNumber += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumber);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrimeNumber);


    }
}
