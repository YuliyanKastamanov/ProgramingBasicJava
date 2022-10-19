package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене от конзолата
        double radians = Double.parseDouble(scanner.nextLine());

        //Пресмятане

        double degrees = radians * 180/Math.PI;

        //Принтиране

        System.out.printf("%.0f", degrees);

    }
}
