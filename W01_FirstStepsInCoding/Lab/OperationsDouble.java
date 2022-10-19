package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class OperationsDouble {
    public static void main(String[] args) {
        //int
        //double
        //string

        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        double result = num1 / num2;
        System.out.println(result);


    }
}
