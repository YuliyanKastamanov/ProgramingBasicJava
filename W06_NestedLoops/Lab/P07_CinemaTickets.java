package W06_NestedLoops.Lab;

import java.util.Scanner;

public class P07_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int counterTotalTickets = 0;
        int counterStudentTickets = 0;
        int counterStandardTickets = 0;
        int counterKidTickets = 0;

        while (!input.equals("Finish")){
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String command = scanner.nextLine();
            int counterTickets = 0;
            while (!command.equals("End")){
                String typeTickets = command;
                counterTickets++;
                //counterTotalTickets++;

                switch (typeTickets){
                    case "student":
                        counterStudentTickets++;
                        break;
                    case "standard":
                        counterStandardTickets++;
                        break;
                    case "kid":
                        counterKidTickets++;
                        break;
                }

                if (counterTickets == freeSeats){
                break;
                }

                command = scanner.nextLine();


            }
            counterTotalTickets += counterTickets;

            System.out.printf("%s - %.2f%% full.%n", movieName, counterTickets * 1.0 / freeSeats * 100);


            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", counterTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", counterStudentTickets * 1.0 / counterTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", counterStandardTickets * 1.0 / counterTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", counterKidTickets * 1.0 / counterTotalTickets * 100);
    }
}
