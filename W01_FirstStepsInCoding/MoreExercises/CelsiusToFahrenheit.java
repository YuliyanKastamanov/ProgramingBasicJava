package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        //Умножете температурата на ° C по 1,8. Добавете 32 към този номер.

        double fahrenheit = (degree * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);



    }
}
