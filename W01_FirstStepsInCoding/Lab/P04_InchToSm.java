package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P04_InchToSm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Инчове вход
        //см = инч*2.54

        double inches = Double.parseDouble(scanner.nextLine());
        double sm = inches*2.54;
        System.out.println(sm);
    }
}
