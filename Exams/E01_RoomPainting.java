package Exams;

import java.util.Scanner;

public class E01_RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Броя кутии с боя – цяло число в интервала [1 … 10 000]
        //2.	Броя на ролките тапети – цяло число в интервала [1 ... 10 000]
        //3.	Цената за един чифт ръкавици – реално число  в интервала [0.00 ... 1000.00]
        //4.	Цената за една четка – реално число  в интервала [0.00 ... 2000.00]

        int countPaintBox = Integer.parseInt(scanner.nextLine());
        int countWallpaperRolls = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());




        //една кутия боя 21.50 лв
        //една ролка тапет 5.20 лв
        //Броят нужни ръкавици представлява 35% от броя на ролките тапети, закръглени нагоре
        //а броят на нужните четки  48% от броя на кутиите боя, закръглени надолу.
        //Вашата задача е да изчислите доставката на всички необходими продукти, която представлява 1 / 15 от общата цена на продуктите.

        double neededGloves = Math.ceil(0.35 * countWallpaperRolls);
        double neededBrush = Math.floor( 0.48 * countPaintBox);

        double paintBoxSum = countPaintBox * 21.50;
        double wallpaperSum = countWallpaperRolls * 5.20;
        double glovesSum = neededGloves * glovesPrice;
        double brushSum = neededBrush * brushPrice;

        double deliveryPrice = (paintBoxSum + wallpaperSum + glovesSum + brushSum) / 15;

        System.out.printf("This delivery will cost %.2f lv.", deliveryPrice);




    }
}
