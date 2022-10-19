package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Брой магнолии – цяло число в интервала [0 … 50]
//Брой зюмбюли – цяло число в интервала [0 … 50]
//Брой рози – цяло число в интервала [0 … 50]
//Брой кактуси – цяло число в интервала [0 … 50]
//Цена на подаръка – реално число в интервала [0.00 … 500.00]

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giffPrice = Double.parseDouble(scanner.nextLine());



//Магнолии – 3.25 лева
//Зюмбюли – 4 лева
//Рози – 3.50 лева
//Кактуси – 8 лева


        //От общата сума, Мария трябва да плати 5% данъци.

        double magnoliasSum = magnolias*3.25;
        int hyacinthSum = hyacinth*4;
        double roseSum = rose*3.50;
        int cactusSum = cactus*8;

        double finalProfit = (magnoliasSum+hyacinthSum+roseSum+cactusSum)*0.95;

        if (finalProfit>=giffPrice){
            double remainingSum = Math.floor(finalProfit-giffPrice);
            System.out.printf("She is left with %.0f leva.",remainingSum);
        } else{
            double shortageSum = Math.ceil(giffPrice-finalProfit);
            System.out.printf("She will have to borrow %.0f leva.",shortageSum);
        }




    }
}
