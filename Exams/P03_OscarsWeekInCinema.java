package Exams;

import java.util.Scanner;

public class P03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String typeHall = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());


        double priceTickets = 0;

        //A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite

        switch (movieName){

            case "A Star Is Born":
                if (typeHall.equals("normal")){
                    priceTickets = 7.50;
                }else if(typeHall.equals("luxury")){
                    priceTickets = 10.50;
                }else if(typeHall.equals("ultra luxury")){
                    priceTickets = 13.50;
                }
                break;

            case "Bohemian Rhapsody":
                if (typeHall.equals("normal")){
                    priceTickets = 7.35;
                }else if(typeHall.equals("luxury")){
                    priceTickets = 9.45;
                }else if(typeHall.equals("ultra luxury")){
                    priceTickets = 12.75;
                }
                break;

            case "Green Book":
                if (typeHall.equals("normal")){
                    priceTickets = 8.15;
                }else if(typeHall.equals("luxury")){
                    priceTickets = 10.25;
                }else if(typeHall.equals("ultra luxury")){
                    priceTickets = 13.25;
                }
                break;

            case "The Favourite":

                if (typeHall.equals("normal")){
                    priceTickets = 8.75;
                }else if(typeHall.equals("luxury")){
                    priceTickets = 11.55;
                }else if(typeHall.equals("ultra luxury")){
                    priceTickets = 13.95;
                }
                break;
        }

        double profit = countTickets * priceTickets;

        System.out.printf("%s -> %.2f lv.", movieName, profit);
    }
}
