package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        //int
        //double
        //string

        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int result = number1 + number2;
        System.out.println(result);


    }
}
