package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Бюджет на групата – цяло число в интервала [1…8000]
        // Сезон – текст : Spring, Summer, Autumn, Winter;
        // Брой рибари – цяло число в интервала [4…18]

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisherMens = Integer.parseInt(scanner.nextLine());


        // Цената за наем на кораба през пролетта е 3000 лв.
        // Цената за наем на кораба през лятото и есента е 4200 лв.
        // Цената за наем на кораба през зимата е 2600 лв.

        // Ако групата е до 6 човека включително – отстъпка от 10%.
        // Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        // Ако групата е от 12 нагоре – отстъпка от 25%.

        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат
        //допълнителна отстъпка.
        //Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

        double rentPrice=0;

        if (season.equals("Spring")){
            rentPrice = 3000;
            if(countFisherMens<=6){
                rentPrice = rentPrice*0.90;
            }else if(countFisherMens>=7 && countFisherMens<=11){
                rentPrice = rentPrice*0.85;
            }else{
                rentPrice = rentPrice*0.75;
            }

        }else if(season.equals("Summer") || season.equals("Autumn")) {
            rentPrice = 4200;
            if (countFisherMens <= 6) {
                rentPrice = rentPrice * 0.90;
            } else if (countFisherMens >= 7 && countFisherMens <= 11) {
                rentPrice = rentPrice * 0.85;
            } else {
                rentPrice = rentPrice * 0.75;
            }
        }else if(season.equals("Winter")) {
            rentPrice = 2600;
            if (countFisherMens <= 6) {
                rentPrice = rentPrice * 0.90;
            } else if (countFisherMens >= 7 && countFisherMens <= 11) {
                rentPrice = rentPrice * 0.85;
            } else {
                rentPrice = rentPrice * 0.75;
            }
        }

        if (countFisherMens % 2 == 0 && (!(season.equals("Autumn")))){

            rentPrice = rentPrice*0.95;
        }

        double diff = Math.abs(budget - rentPrice);

        if(budget<rentPrice){
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }else {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }







    }
}
