package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вход от конзолата 1. цена на Скумрията за кг. 2. цена на Цацата за кг. 3. Паламуд Кг. 4.Сафрид Кг. 5. Миди кг.

        double priceMackerelKg = Double.parseDouble(scanner.nextLine());
        double priceSpratKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        // Паламуд 60% по скъп от скумрията
        // Сафрид 80% по скъм от цацата
        // Миди - 7.50 за кг
        // Колко пари ще са нужни, за да се плати сметката Паламуд, Сафрид и Миди ?

        double priceBonitoPerKg = priceMackerelKg + priceMackerelKg*0.6;

        double bonitoFinalPrice = priceBonitoPerKg*bonitoKg;

        double priceHorseMackerelPerKg = priceSpratKg + priceSpratKg*0.8;

        double horseMackerelFinalPrice = priceHorseMackerelPerKg*horseMackerelKg;

        double musselsFinalPrice = musselsKg*7.50;

        double sumTotal = bonitoFinalPrice + horseMackerelFinalPrice + musselsFinalPrice;

        System.out.printf("%.2f", sumTotal);






    }
}
