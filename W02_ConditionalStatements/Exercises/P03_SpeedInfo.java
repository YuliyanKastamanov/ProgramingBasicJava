package W02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P03_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        //Да се напише програма, която чете скорост (реално число), въведена от потребителя и отпечатва
        //информация за скоростта. При скорост до 10 (включително) отпечатайте “slow”. При скорост над 10 и до 50
        //отпечатайте “average”. При скорост над 50 и до 150 отпечатайте “fast”. При скорост над 150 и до 1000
        //отпечатайте “ultra fast”. При по-висока скорост отпечатайте “extremely fast”.

        if(speed<=10){
            System.out.println("slow");
        }else if(speed<=50){
            System.out.println("average");
        }else if(speed<=150){
            System.out.println("fast");
        }else if(speed<=1000){
            System.out.println("ultra fast");
        }else {
            System.out.println("extremely fast");
        }
    }
}
