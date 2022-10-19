package Exams;

import java.util.Scanner;

public class E02_BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //На първия ред - името на футболният фен – текст
        //На втория ред - предвиденият бюджет  – реално число в диапазона [1.0… 100 000.0]
        //На третия ред - брой бутилки бира – цяло число в диапазона [1… 100 000]
        //На четвърти ред - брой пакети чипс – цяло число в диапазона [1… 100 000]

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int countBeers = Integer.parseInt(scanner.nextLine());
        int countSnacks = Integer.parseInt(scanner.nextLine());

        //Цената на една бира е 1.20 лв.
        //цената на един пакет чипс е равна на 45% от общата стойност на закупените бири.
        //Общата цена на чипса да се закръгли до по-голямо число

        double beersSum = countBeers * 1.20;
        double snacksSum = Math.ceil((0.45 * beersSum) * countSnacks);

        double finalSum = beersSum + snacksSum;
        double diff = Math.abs(finalSum - budget);

        if (finalSum <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        }else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }




    }
}
