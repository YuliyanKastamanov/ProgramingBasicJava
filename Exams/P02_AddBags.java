package Exams;

import java.util.Scanner;

public class P02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20Kg = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());


        double pricePerLuggage = 0;

        if (kg<10){
            pricePerLuggage = 0.2 * priceOver20Kg;
        }else if( kg >= 10 && kg <= 20){
            pricePerLuggage = 0.5 * priceOver20Kg;
        } else if(kg > 20){
            pricePerLuggage = priceOver20Kg;
        }


        if (daysToTrip > 30){
            pricePerLuggage = pricePerLuggage + 0.10 * pricePerLuggage;
        } else if (daysToTrip >=7 && daysToTrip <= 30){
            pricePerLuggage = pricePerLuggage + 0.15 * pricePerLuggage;
        }else if (daysToTrip < 7){
            pricePerLuggage = pricePerLuggage + 0.40 * pricePerLuggage;
        }

        double totalPrice = count * pricePerLuggage;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);

    }
}
