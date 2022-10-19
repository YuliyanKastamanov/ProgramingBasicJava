package Exams;

import java.util.Scanner;

public class E06_ExcursionGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countGamers = Integer.parseInt(scanner.nextLine());

        int countWin = 0;
        int countLost = 0;


        for (int gamers = 1; gamers <= countGamers ; gamers++) {


            String destination = scanner.nextLine();
            int sumNumbers = 0;
            for (int numbers = 1; numbers <= destination.length() ; numbers++) {
                int number = Integer.parseInt(scanner.nextLine());
                sumNumbers += number;
            }
            if(sumNumbers % destination.length() == 0){
                countWin++;
                System.out.println("Win");

            }else {
                countLost++;
                System.out.println("Lost");
            }


        }



        double winners = 100*countWin*1.0 / (countWin*1.0 +countLost*1.0);
        double lost = 100*countLost*1.0 / (countWin*1.0+countLost*1.0);

        System.out.printf("Win: %.2f%%%n",winners);
        System.out.printf("Lost: %.2f%%", lost);


    }
}
