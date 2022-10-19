package W03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P09_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitOrVegetable = scanner.nextLine();

        //Плодовете fruit са: banana, apple, kiwi, cherry, lemon и grapes;
        //Зеленчуците vegetable са: tomato, cucumber, pepper и carrot

        if (fruitOrVegetable.equals("banana") || fruitOrVegetable.equals("apple") || fruitOrVegetable.equals("kiwi") || fruitOrVegetable.equals("cherry") || fruitOrVegetable.equals("lemon") || fruitOrVegetable.equals("grapes")){
            System.out.println("fruit");
        } else if( fruitOrVegetable.equals("tomato") || fruitOrVegetable.equals("cucumber") || fruitOrVegetable.equals("pepper") || fruitOrVegetable.equals("carrot")){
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}
