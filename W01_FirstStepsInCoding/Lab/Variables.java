package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());


        System.out.println(text);
        System.out.println(number);
        System.out.println(num2);
    }


}
