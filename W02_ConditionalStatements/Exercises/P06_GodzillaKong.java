package W02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P06_GodzillaKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double decor = budget*0.1;

        double costumeTotal = statists*costumePrice;

        if(statists>150){

            costumeTotal = costumeTotal*0.90;
        }

        double totalSum = decor + costumeTotal;

        double diff = Math.abs(budget - totalSum);


        //Ако парите за декора и дрехите са повече от бюджета:
        //"Not enough money!";
        //"Wingard needs {парите недостигащи за филма} leva more.";
        //Ако парите за декора и дрехите са по малко или равни на бюджета:
        //"Action!";
        //"Wingard starts filming with {останалите пари} leva left.";

        if (totalSum>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }




    }
}
