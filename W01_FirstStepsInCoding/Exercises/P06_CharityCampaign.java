package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06_CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Прочитане от конзолата: 1. Броя на дните, в които тече кампанията, 2. Броя на сладкарите, 3. Торти, 4. Гофрети, 5. Палачинки;

        int days = Integer.parseInt(scanner.nextLine());
        int cooker = Integer.parseInt(scanner.nextLine());
        int cakes  = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        //Цени

        double cakePrice = 45;
        double wafflesPrice = 5.80;
        double pancakesPrice = 3.20;

        //Пресмятане

        double cakesSum = cakePrice * cakes;
        double wafflesSum = wafflesPrice * waffles;
        double pancakesSum = pancakesPrice * pancakes;
        double sumPerDay = (cakesSum + wafflesSum + pancakesSum)*cooker;
        double sumCampaign = sumPerDay * days;

        double finalSum = sumCampaign - sumCampaign * 1/8;

        //Принтиране

        System.out.printf("%.2f", finalSum);






    }
}
