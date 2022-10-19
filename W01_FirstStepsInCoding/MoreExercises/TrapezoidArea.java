package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход от конзолата: 1. Страна А, 2. Страна Б, 3. Височина на трапеца

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        //Пресмятане (А+Б)* H/2

        double area = (sideA + sideB)*height/2;

        System.out.printf("%.2f", area);
    }
}
