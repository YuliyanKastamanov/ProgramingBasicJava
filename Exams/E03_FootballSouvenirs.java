package Exams;

import java.util.Scanner;

public class E03_FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        int countSouvenirs = Integer.parseInt(scanner.nextLine());

        //: "Argentina", "Brazil", "Croatia", "Denmark"
        //"flags", "caps", "posters", "stickers"


                 //Аржентина	Бразилия	Хърватия	Дания
       // флагчета	3.25 лв.	4.20 лв.	2.75 лв.	3.10 лв.
        //шапки	    7.20 лв.	8.50 лв.	6.90 лв.	6.50 лв.
        //плакати	5.10 лв.	5.35 лв.	4.95 лв.	4.80 лв.
        //стикери	1.25 лв.	1.20 лв.	1.10 лв.	0.90 лв.

        double finalSum = 0;



        if (team.equals("Argentina")){
            if (souvenirType.equals("flags")){
                finalSum = countSouvenirs * 3.25;
            }else if(souvenirType.equals("caps")){
                finalSum = countSouvenirs * 7.20;
            }else if(souvenirType.equals("posters")) {
                finalSum = countSouvenirs * 5.10;
            }else if(souvenirType.equals("stickers")) {
                finalSum = countSouvenirs * 1.25;
            }else {
                System.out.println("Invalid stock!");
                return;
            }
        }else if (team.equals("Brazil")){
            if (souvenirType.equals("flags")){
                finalSum = countSouvenirs * 4.20;
            }else if(souvenirType.equals("caps")){
                finalSum = countSouvenirs * 8.50;
            }else if(souvenirType.equals("posters")) {
                finalSum = countSouvenirs * 5.35;
            }else if(souvenirType.equals("stickers")) {
                finalSum = countSouvenirs * 1.20;
            }else {
                System.out.println("Invalid stock!");
                return;
            }
        }else if (team.equals("Croatia")){
            if (souvenirType.equals("flags")){
                finalSum = countSouvenirs * 2.75;
            }else if(souvenirType.equals("caps")){
                finalSum = countSouvenirs * 6.90;
            }else if(souvenirType.equals("posters")) {
                finalSum = countSouvenirs * 4.95;
            }else if(souvenirType.equals("stickers")) {
                finalSum = countSouvenirs * 1.10;
            }else {
                System.out.println("Invalid stock!");
                return;
            }
        }else if (team.equals("Denmark")){
            if (souvenirType.equals("flags")){
                finalSum = countSouvenirs * 3.10;
            }else if(souvenirType.equals("caps")){
                finalSum = countSouvenirs * 6.50;
            }else if(souvenirType.equals("posters")) {
                finalSum = countSouvenirs * 4.80;
            }else if(souvenirType.equals("stickers")) {
                finalSum = countSouvenirs * 0.90;
            }else {
                System.out.println("Invalid stock!");
                return;
            }
        }else {
            System.out.println("Invalid country!");
            return;
        }

        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, souvenirType, team, finalSum);






    }
}
