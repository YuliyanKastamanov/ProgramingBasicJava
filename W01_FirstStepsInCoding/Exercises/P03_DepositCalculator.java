package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход от конзолата

        double depositSum = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        //Изчисления

        double interest = (depositSum*annualInterestRate/100)/12;
        double sum = depositSum + (month*interest);

        //Принтиране

        System.out.printf("%.2f", sum);


    }
}
