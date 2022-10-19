package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P05_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Име > Конзола > Променлива
        //2. Печатаме "Hello, <name>

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}
