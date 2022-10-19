package W03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P13_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - дни за престой - цяло число в интервала [0...365]
        //•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //•	Трети ред - оценка - "positive"  или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();



        //	"room for one person" – 18.00 лв. за нощувка
        //	"apartment" – 25.00 лв. за нощувка
        //	"president apartment" – 35.00 лв. за нощувка
        //Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението,
        // което ще избере, той може да ползва различно намаление. Намаленията са както следва:

        //вид помещение			    по-малко от 10 дни			между 10 и 15 дни			повече от 15 дни
        //room for one person		не ползва намаление			не ползва намаление			не ползва намаление
        //apartment				    30% от крайната цена		35% от крайната цена		50% от крайната цена
        //president apartment		10% от крайната цена		15% от крайната цена		20% от крайната цена

        //След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
        //Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея.
        //Ако оценката му е негативна приспада от цената 10%.

        int nights = days - 1;
        double sum = 0;
        double finalSum = 0;

        if ( roomType.equals("room for one person")){
            if(rating.equals("positive")){
                sum = nights*18.00;
                finalSum = sum * 1.25;
                System.out.printf("%.2f",finalSum);

            }else if (rating.equals("negative")){
                sum = nights*18.00;
                finalSum = sum * 0.90;
                System.out.printf("%.2f",finalSum);
            }
        }else if( roomType.equals("apartment")){
            if (rating.equals("positive")){
                if(days<10){
                    sum = (nights*25.00)*0.70;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }else if (days>=10 && days<=15){
                    sum = (nights*25.00)*0.65;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }else if(days>15){
                    sum = (nights*25.00)*0.50;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }
            }else if(rating.equals("negative")){
                if(days<10){
                    sum = (nights*25.00)*0.70;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }else if (days>=10 && days<=15){
                    sum = (nights*25.00)*0.65;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }else if(days>15){
                    sum = (nights*25.00)*0.50;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }
            }
        }else if( roomType.equals("president apartment")){
            if (rating.equals("positive")){
                if(days<10){
                    sum = (nights*35.00)*0.90;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }else if (days>=10 && days<=15){
                    sum = (nights*35.00)*0.85;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }else if(days>15){
                    sum = (nights*35.00)*0.80;
                    finalSum = sum*1.25;
                    System.out.printf("%.2f",finalSum);
                }
            }else if(rating.equals("negative")){
                if(days<10){
                    sum = (nights*35.00)*0.90;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }else if (days>=10 && days<=15){
                    sum = (nights*35.00)*0.85;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }else if(days>15){
                    sum = (nights*35.00)*0.80;
                    finalSum = sum*0.90;
                    System.out.printf("%.2f",finalSum);
                }
            }
        }


    }
}
