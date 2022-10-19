package Exams;

import java.util.Scanner;

public class P01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerRacket = Double.parseDouble(scanner.nextLine());
        int countRackets = Integer.parseInt(scanner.nextLine());
        int countTrainers = Integer.parseInt(scanner.nextLine());


        double priceRackets = pricePerRacket * countRackets;
        double priceTrainers = countTrainers * (pricePerRacket /  6);
        double priceEquipment = 0.2 * (priceRackets + priceTrainers);

        double expenses = priceRackets + priceEquipment + priceTrainers;

        double paidByDjokovic = expenses / 8;
        double paidBySponsors = 7 * expenses / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(paidByDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(paidBySponsors));










    }
}
