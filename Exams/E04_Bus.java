package Exams;

import java.util.Scanner;

public class E04_Bus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - броят пътници в автобуса при потеглянето му - цяло число в интервала [1 ... 100]
        //•	На втория ред - броят на спирките - цяло число в интервала [1…50]
        //•	На следващите редове (равни на броят на спирките * 2) - броя на пътниците, които слизат и броя на пътниците които се качват - цели числа в интервала [0…100]

        int initialPassengers = Integer.parseInt(scanner.nextLine());
        int countStops = Integer.parseInt(scanner.nextLine());



        for (int stop = 1; stop <= countStops ; stop++) {

            int leavePassengers = Integer.parseInt(scanner.nextLine());
            int newPassengers = Integer.parseInt(scanner.nextLine());


            if(stop % 2 == 1){
                initialPassengers = initialPassengers + newPassengers - leavePassengers + 2;
            }else {
                initialPassengers = initialPassengers + newPassengers - leavePassengers - 2;
            }


            
        }
        System.out.printf("The final number of passengers is : %d", initialPassengers);




    }
}
