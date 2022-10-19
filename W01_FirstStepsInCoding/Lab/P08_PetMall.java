package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P08_PetMall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Вход от конзолата 1. Брой кучета (цяло число), 2. Брой други животни (цяло число)

        int dogCount = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());

        //Пресмятане: брой кучета * 2.50 + брой други животни * 4

        double calculatingDog = dogCount * 2.50;
        int calculatingOther = otherAnimals * 4;

        System.out.println(calculatingDog + calculatingOther);


    }
}
