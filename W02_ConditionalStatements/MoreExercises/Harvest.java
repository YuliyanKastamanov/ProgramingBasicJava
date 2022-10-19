package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        //От 1 кв.м лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде.
        //Желаното количество вино за продан е Z литра.

        //Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
        //Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.

        double totalGrape = ((vineyard*grapePerSquareMeter)*0.40);
        double totalWine = totalGrape/2.5;

        if ( totalWine<neededWine){
            double notEnoughWine = Math.floor(neededWine-totalWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",notEnoughWine);
        }else {
            double totalWine2 = Math.floor(totalWine);
            double remainingWine = Math.ceil(totalWine - neededWine);
            double wineForWorker = Math.ceil(remainingWine/workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",totalWine2);
            System.out.printf("%.0f liters left -> %.0f liters per person.",remainingWine, wineForWorker);

        }


    }
}
