package Exams;

import java.util.Scanner;

public class AgencyProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String Airline = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double agencyFee = Double.parseDouble(scanner.nextLine());

        double kidTicketPrice = adultTicketPrice - (adultTicketPrice*70)/100;
        double adultTicketsFinalPrice = adultTicketPrice + agencyFee;
        double kidTicketsFinalPrice = kidTicketPrice + agencyFee;


        double totalTicketsPrice = (adultTicketsFinalPrice*adultTickets) + (kidTicketsFinalPrice*kidTickets);
        double agencyProfit = 0.20*totalTicketsPrice;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", Airline, agencyProfit);


    }
}
