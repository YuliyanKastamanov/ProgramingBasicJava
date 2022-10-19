package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKiloVegetables = Double.parseDouble(scanner.nextLine());
        double pricePerKiloFruits = Double.parseDouble(scanner.nextLine());
        int sumKiloVegetables = Integer.parseInt(scanner.nextLine());
        int sumKiloFruits = Integer.parseInt(scanner.nextLine());

        double sumVegetables = pricePerKiloVegetables*sumKiloVegetables;
        double sumFruits = pricePerKiloFruits*sumKiloFruits;

        double finalPrice = (sumFruits+sumVegetables) /1.94;

        System.out.printf("%.2f", finalPrice);
    }
}
