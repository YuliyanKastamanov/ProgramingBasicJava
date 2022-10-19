package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //x – височината на къщата – реално число в интервала [2...100]
        //y – дължината на страничната стена – реално число в интервала [2...100]
        //h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double height = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());

        double sideWall = height * length;
        double sideWallsArea = sideWall*2 - (2*1.5*1.5);

        double frontSide = height*height;
        double frontAftArea = frontSide*2 - (1.2*2);

        double greenArea = sideWallsArea + frontAftArea;
        double greenPaint = greenArea/3.4;

        double sideRoofArea = (height*length)*2;
        double frontAftRoofArea = (heightRoof*height/2)*2;

        double redArea = sideRoofArea + frontAftRoofArea;
        double redPaint = redArea/4.3;


        //Да се отпечатат на конзолата две числа всяко на нов ред:
        //Литрите зелена боя
        //Литритe червена боя
        //Форматирани до вторият знак след десетичната запетая.

        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);

    }
}
