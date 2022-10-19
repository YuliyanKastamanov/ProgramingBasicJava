package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        //Напишете програма, която да приема на входа бюджета и сезона, а на
        //изхода да изкарва, къде ще почива програмиста и колко ще похарчи.
        //Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива
        //на къмпинг, а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или
        //хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
        // При 100лв. или по-малко – някъде в България
        //o Лято – 30% от бюджета
        //o Зима – 70% от бюджета
        // При 1000лв. или по малко – някъде на Балканите
        //o Лято – 40% от бюджета
        //o Зима – 80% от бюджета
        // При повече от 1000лв. – някъде из Европа
        //o При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

        String destination = "";
        double price = 0;

        if (budget<= 100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                price = budget*0.30;
            } else if (season.equals("winter")){
                price = budget*0.70;
            }

        }else if(budget>100 && budget<=1000){
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
            }else if( season.equals("winter")){
                price = budget*0.80;
            }

        }else{
            destination = "Europe";
            price = budget * 0.90;

            }


        String accommodationType = "";

        if (destination=="Europe"){
            accommodationType = "Hotel";

        }else {
            if(season.equals("winter")){
                accommodationType = "Hotel";
            }else if (season.equals("summer")){
                accommodationType = "Camp";
            }
        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f",accommodationType, price);


    }
}
