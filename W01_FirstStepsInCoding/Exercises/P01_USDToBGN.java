package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P01_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четене от конзолата
        double usd = Double.parseDouble(scanner.nextLine());

        //Пресмятане
        double bgn = usd * 1.79549;

        //Принтиране

        System.out.println(bgn);



    }
}
