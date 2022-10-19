package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
//•	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
//•	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double workingHours = (days*0.9)*8;
        double overtimeHours = (days*2)*workers;
        double finalHours = Math.floor(workingHours+overtimeHours);

        if (finalHours>=neededHours){
            double remainingHours = Math.floor(finalHours-neededHours);
            System.out.printf("Yes!%.0f hours left.",remainingHours);
        } else {
            double notEnoughTime = Math.floor(neededHours-finalHours);
            System.out.printf("Not enough time!%.0f hours needed.",notEnoughTime);
        }




    }
}
