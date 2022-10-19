package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//Напишете програма, която познава дали резервоара на едно превозно средство има нужда от презареждане на горивото или не.
//От конзолата се четат два реда – текст и реално число, на първия ред се чете типа на горивото – текст с възможности:
//"Diesel", "Gasoline" или "Gas", а на втория литрите гориво, които има в резервоара.
//Ако литрите гориво са повече или равни на 25, на конзолата да се отпечата "You have enough {вида на горивото}.",
//ако са по-малко от 25, да се отпечата "Fill your tank with {вида на горивото}!".
//В случай, че бъде въведено гориво, различно от посоченото, да се отпечата "Invalid fuel!"."

        String fuelType = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());

        if (litersFuel>=25){
            switch (fuelType){
                case "Diesel":
                    System.out.println("You have enough diesel.");
                    break;

                case "Gasoline":
                    System.out.println("You have enough gasoline.");
                    break;

                case "Gas":
                    System.out.println("You have enough gas.");
                    break;

                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        }else {
            switch (fuelType){
                case "Diesel":
                    System.out.println("Fill your tank with diesel!");
                    break;

                case "Gasoline":
                    System.out.println("Fill your tank with gasoline!");
                    break;

                case "Gas":
                    System.out.println("Fill your tank with gas!");
                    break;

                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        }

    }
}
