package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double circleArea = radius*radius * Math.PI;
        double perimeter = radius * Math.PI * 2;

        System.out.printf("%.2f%n", circleArea);
        System.out.printf("%.2f", perimeter);
    }
}
