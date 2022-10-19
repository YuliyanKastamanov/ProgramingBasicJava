package W06_NestedLoops.Lab;

import java.util.Scanner;

public class P06_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")){
            double minBudged = Double.parseDouble(scanner.nextLine());
            double money = 0;

            while (money < minBudged){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                money += savedMoney;
            }

            System.out.println("Going to " + command + "!");



            command = scanner.nextLine();


        }
    }
}
