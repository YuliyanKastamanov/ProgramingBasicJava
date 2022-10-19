package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене от конзолата: Цяло число

        int hallRent = Integer.parseInt(scanner.nextLine());

        //Изчисления: 1. Торта 20% от цената на залата; 2. Напитки 45% по-малко от цената на тортата; 3. Аниматор - 1/3 от наема на залата;

        double cake = hallRent * 20/100;

        double drinks = cake - cake*45/100;

        double animator = hallRent/3;

        double sum = hallRent + cake + drinks + animator;

        //Принтиране

        System.out.println(sum);



    }
}
