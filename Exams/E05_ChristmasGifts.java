package Exams;

import java.util.Scanner;

public class E05_ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countAdults = 0;
        int sumSweaters = 0;
        int countKids = 0;
        int sumToys = 0;

        while (!input.equals("Christmas")){
            int years = Integer.parseInt(input);

            if(years>16){
                countAdults++;
                sumSweaters += 15;
            }else{
                countKids++;
                sumToys+=5;
            }

            input = scanner.nextLine();


        }

        System.out.printf("Number of adults: %d%n", countAdults);
        System.out.printf("Number of kids: %d%n", countKids);
        System.out.printf("Money for toys: %d%n", sumToys);
        System.out.printf("Money for sweaters: %d%n", sumSweaters);









    }
}
