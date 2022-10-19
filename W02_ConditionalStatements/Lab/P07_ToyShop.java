package W02_ConditionalStatements.Lab;

import java.util.Scanner;

public class P07_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни. С парите, които
        //ще спечели иска да отиде на екскурзия. Да се напише програма, която пресмята печалбата от поръчката.
        //Цени на играчките:
        // Пъзел - 2.60 лв.
        // Говореща кукла - 3 лв.
        // Плюшено мече - 4.10 лв.
        // Миньон - 8.20 лв.
        // Камионче - 2 лв.
        // Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена. От спечелените
        // пари Петя трябва да даде 10% за наема на магазина. Да се пресметне дали парите ще ѝ стигнат да отиде нa екскурзия.

        //От конзолата се четат 6 реда:
        //1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2. Брой пъзели - цяло число в интервала [0… 1000]
        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5. Брой миньони - цяло число в интервала [0 … 1000]
        //6. Брой камиончета - цяло число в интервала [0 … 1000]

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzlesSum = puzzles*2.6;
        double talkingDollSum = talkingDoll*3;
        double teddyBearSum = teddyBear*4.10;
        double minionsSum = minions*8.20;
        double trucksSum = trucks*2;

        double total = puzzlesSum+talkingDollSum+teddyBearSum+minionsSum+trucksSum;

        double totalToys = puzzles+talkingDoll+teddyBear+minions+trucks;

        //На конзолата се отпечатва:
        // Ако парите са достатъчни се отпечатва:
        //"Yes! {оставащите пари} lv left.";
        //Ако парите НЕ са достатъчни се отпечатва:
        //"Not enough money! {недостигащите пари} lv needed."

        if (totalToys>=50){
            double profit = total - (total*0.25);
            double finalProfit = profit - (profit*0.10);
            if (finalProfit>=vacationPrice){
                double sumLeft = finalProfit - vacationPrice;
                System.out.printf("Yes! %.2f lv left.",sumLeft);
            }else {
                double sumNeeded = vacationPrice - finalProfit;
                System.out.printf("Not enough money! %.2f lv needed.", sumNeeded);
            }


        }else {
            double finalProfit2 = total - (total*0.10);
            if (finalProfit2>=vacationPrice){
                double sumLeft2 = finalProfit2 - vacationPrice;
                System.out.printf("Yes! %.2f lv left.",sumLeft2);
            }else {
                double sumNeeded2 = vacationPrice - finalProfit2;
                System.out.printf("Not enough money! %.2f lv needed.", sumNeeded2);
            }

        }



    }
}
