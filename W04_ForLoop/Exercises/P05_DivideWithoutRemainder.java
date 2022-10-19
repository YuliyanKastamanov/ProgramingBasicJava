package W04_ForLoop.Exercises;

import java.util.Scanner;

public class P05_DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value % 2 ==0){
                count1++;
            }
            if(value % 3 ==0){
                count2++;
            }
            if (value % 4 ==0){
                count3++;
            }


        }

        double p1 = count1*1.0/n*100;
        double p2 = count2*1.0/n*100;
        double p3 = count3*1.0/n*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);


    }
}
