package W04_ForLoop.Lab;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя, и проверява дали
        //сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума). При равенство
        //печата &quot; Yes, sum = &quot; + сумата; иначе печата &quot; No, diff = &quot; + разликата. Разликата се изчислява като
        //положително число (по абсолютна стойност).

        int n = Integer.parseInt(scanner.nextLine());
        int sumL=0;
        int sumR=0;

        for (int step = 1; step <=n ; step++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumL+=num;
        }

        for (int step = 1; step <=n ; step++) {
            int num =Integer.parseInt(scanner.nextLine());
            sumR+=num;
            
        }

        if(sumL==sumR){
            System.out.println("Yes, sum = " + sumL);
        }else {
            System.out.println("No, diff = " + Math.abs(sumL-sumR));
        }
        
        
        
    }
    
}
