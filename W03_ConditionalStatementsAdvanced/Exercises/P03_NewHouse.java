package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        // Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus";
        // Брой цветя - цяло число в интервала [10…1000]
        // Бюджет - цяло число в интервала [50…2500]

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

       //Цена Роза - 5лв , Далия - 3.80 лв , Лале - 2.80лв ,  Нарцис - 3лв, Гладиола - 2.50лв.

        // Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        // Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        // Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        // Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        // Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double price = 0;

        if (flowerType.equals("Roses")){
            price = flowerCount*5;
            if (flowerCount>80){
                price= price*0.90;
            }
        }else if(flowerType.equals("Dahlias")){
            price = flowerCount*3.80;
            if(flowerCount>90){
                price = price*0.85;
            }
        }else if(flowerType.equals("Tulips")){
            price = flowerCount*2.80;
            if(flowerCount>80){
                price = price*0.85;
            }
        }else if(flowerType.equals("Narcissus")){
            price = flowerCount*3;
            if(flowerCount<120){
                price = price * 1.15;
            }
        }else if(flowerType.equals("Gladiolus")){
            price = flowerCount*2.50;
            if(flowerCount<80){
                price = price*1.20;
            }
        }

        double diff = Math.abs(price-budget);

        if (price>budget){
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerCount,flowerType,diff);
        }




    }
}
