package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        // За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        // За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        // За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        // За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        //Май и октомври -   Студио – 50 лв./нощувка, Апартамент – 65 лв./нощувка
        //Юни и септември - Студио – 75.20 лв./нощувка, Апартамент – 68.70 лв./нощувка
        //Юли и август - Студио – 76 лв./нощувка, Апартамент – 77 лв./нощувка

        //Да се отпечатат на конзолата 2 реда:
        //На първия ред: “Apartment: {цена за целият престой} lv.”
        //На втория ред: “Studio: {цена за целият престой} lv.“
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.
        //На първия ред е месецът – May, June, July, August, September или October

        double totalSumStudio= 0;
        double totalSumApart = 0;

        if(month.equals("May") || month.equals("October")){
            if (nights>14){
                totalSumStudio = (nights*50)*0.70;
                totalSumApart = (nights*65)*0.90;

            }else if(nights>7 && nights<=14){
                totalSumStudio = (nights*50)*0.95;
                totalSumApart = nights*65;
            }else {
                totalSumStudio = nights*50;
                totalSumApart = nights*65;
            }
        }else if (month.equals("June") || month.equals("September")){
            if (nights>14){
                totalSumStudio = (nights*75.20)*0.80;
                totalSumApart = (nights*68.70)*0.90;
            }else{
                totalSumStudio = nights*75.20;
                totalSumApart = nights*68.70;
            }
        }else if(month.equals("July") || month.equals("August")){
            if (nights>14){
                totalSumStudio = nights*76;
                totalSumApart = (nights*77)*0.90;

            }else {
                totalSumStudio = nights*76;
                totalSumApart = nights*77;
            }
        }
        //Да се отпечатат на конзолата 2 реда:
        //На първия ред: “Apartment: {цена за целият престой} lv.”
        //На втория ред: “Studio: {цена за целият престой} lv.“
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.
        //На първия ред е месецът – May, June, July, August, September или October

        System.out.printf("Apartment: %.2f lv.%n",totalSumApart);
        System.out.printf("Studio: %.2f lv.",totalSumStudio);


    }
}
