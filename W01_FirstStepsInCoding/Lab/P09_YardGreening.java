package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Прочитане от конзолата
        double squareMeter = Double.parseDouble(scanner.nextLine());

        //1. Цена за квадрат, 2. Отстъпка

        double pricePerSquare = 7.61;
        double discountPercent = 0.18;

        //Изчисления

        double initialPrice = squareMeter * pricePerSquare;
        double discount =  initialPrice * discountPercent;
        double finalPrice = initialPrice - discount;

        //Принтиране

        //System.out.println( "The final price is: " + finalPrice + " lv.");
        //System.out.println( "The discount is: " + discount + " lv.");
        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.printf("\n");
        System.out.printf( "The discount is: %.2f lv.", discount);



    }
}
