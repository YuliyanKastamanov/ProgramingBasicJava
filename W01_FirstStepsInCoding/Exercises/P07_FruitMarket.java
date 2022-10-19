package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P07_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на конзолата: 1. Цена на ягодите в лева, 2. Количество банани в кг., 3. Количество портокали в кг., 4. Количество малини в кг., 5. Количество ягоди е кг.

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());


        //Пресмятане:
        //цената на малините е с 50% по-ниска от тази на ягодите;
        //цената на портокалите е с 40% по-ниска от цената на малините;
        //цената на бананите е с 80% по-ниска от цената на малините.

        double raspberryPrice = strawberryPrice * 0.5;
        double orangePrice = raspberryPrice - raspberryPrice * 0.4;
        double bananasPrice = raspberryPrice - raspberryPrice * 0.8;

        double sum = strawberryPrice*strawberryQuantity + bananasPrice*bananasQuantity + orangePrice*orangeQuantity + raspberryPrice*raspberryQuantity;

        //Принтиране

        System.out.printf("%.2f", sum);


    }
}
