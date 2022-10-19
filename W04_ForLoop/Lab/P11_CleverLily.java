package W04_ForLoop.Lab;

import java.util.Scanner;

public class P11_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Лили вече е на N години. За всеки свой рожден ден тя получава подарък. За нечетните рождени дни (1, 3,
        //5...n) получава играчки, а за всеки четен (2, 4, 6...n) получава пари. За втория рожден ден получава 10.00 лв,
        //като сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -&gt; 10, 4 -&gt; 20, 6 -&gt; 30...и т.н.).
        //През годините Лили тайно е спестявала парите. Братът на Лили, в годините, които тя получава пари, взима
        //по 1.00 лев от тях. Лили продала играчките получени през годините, всяка за P лева и добавила сумата към
        //спестените пари. С парите искала да си купи пералня за X лева. Напишете програма, която да пресмята,
        //колко пари е събрала и дали ѝ стигат да си купи пералня.


        // Възрастта на Лили - цяло число в интервала [1...77]
        // Цената на пералнята - число в интервала [1.00...10 000.00]
        // Единична цена на играчка - цяло число в интервала [0...40]

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        int piggyBank = 0;


        for (int birthday = 1; birthday <=age ; birthday++) {
            if (birthday %2 ==1){
                toyCount++;
            }else{
                piggyBank += birthday*5 - 1;
            }

        }

        int totalSavedMoney = (toyPrice*toyCount) + piggyBank;


        if (totalSavedMoney >= washingMachinePrice){
            double leftMoney = totalSavedMoney -washingMachinePrice;
            System.out.printf("Yes! %.2f",leftMoney);
        } else{
            double needMoney = washingMachinePrice-totalSavedMoney;
            System.out.printf("No! %.2f",needMoney);
        }
    }
}
