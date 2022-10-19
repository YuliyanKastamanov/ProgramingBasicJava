package W05_WhileLoop.Exercises;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int sumSteps = 0;

        String input = scanner.nextLine();

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            sumSteps+=steps;

            if (sumSteps>=10000){
                break;
            }
            input = scanner.nextLine();

        }
        if (input.equals("Going home")){
            int addSteps = Integer.parseInt(scanner.nextLine());

            sumSteps+=addSteps;

        }

        int diff = sumSteps - 10000;

        if(sumSteps>=10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }else{
            System.out.printf("%d more steps to reach goal.", Math.abs(diff));
        }
    }
}
