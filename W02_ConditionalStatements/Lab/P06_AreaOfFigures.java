package W02_ConditionalStatements.Lab;

import java.util.Scanner;

public class P06_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double squareArea = side*side;
            System.out.printf("%.3f" , squareArea);

        } else if (figure.equals("rectangle")){

            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double rectangleArea = sideA*sideB;
            System.out.printf("%.3f",rectangleArea);

        }else if ( figure.equals("circle")){

            double radius = Double.parseDouble(scanner.nextLine());
            double circleArea = radius*radius*Math.PI;
            System.out.printf("%.3f",circleArea);

        } else if (figure.equals("triangle")) {

            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHeight = Double.parseDouble(scanner.nextLine());
            double triangleArea = triangleSide * triangleHeight / 2;

            System.out.printf("%.3f", triangleArea);
        }


    }
}
