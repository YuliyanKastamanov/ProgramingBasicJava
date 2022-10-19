package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Първи ред – брой дни – цяло число в интервал [1…5000]
//•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
//•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
//•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
//•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodPerDogKg = Double.parseDouble(scanner.nextLine());
        double foodPerCatKg = Double.parseDouble(scanner.nextLine());
        double foodPerTurtleGrams = Double.parseDouble(scanner.nextLine());

        double totalFoodDog = foodPerDogKg*days;
        double totalFoodCat = foodPerCatKg*days;
        double totalFoodTurtleKg = (foodPerTurtleGrams/1000)*days;

        double totalFood = totalFoodCat+totalFoodDog+totalFoodTurtleKg;

        if (totalFood<=foodKg){
            double remainingFood = Math.floor(foodKg-totalFood);
            System.out.printf("%.0f kilos of food left.",remainingFood);
        }else {
            double moreFoodNeeded = Math.ceil(totalFood-foodKg);
            System.out.printf("%.0f more kilos of food are needed.",moreFoodNeeded);
        }




    }
}
