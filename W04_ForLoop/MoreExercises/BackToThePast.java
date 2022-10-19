package W04_ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int yearLive = Integer.parseInt(scanner.nextLine());

        //Иванчо е на 18 години и получава наследство, което се състои от X сума пари и машина на времето.
        //Той решава да се върне до 1800 година, но не знае дали парите ще са достатъчни, за да живее без да работи.
        //Напишете програма, която пресмята, дали Иванчо ще има достатъчно пари, за да не се налага да работи до дадена година включително.
        //Като приемем, че за всяка четна (1800, 1802 и т.н.) година ще харчи 12 000 лева.
        //За всяка нечетна (1801,1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].
        int age = 17;






        for (int years = 1800; years <=yearLive ; years++) {

            if (years % 2 ==0){
                age +=1;
                money-=12000;
            }
            if (years % 2 ==1){
                age +=1;
                money-=12000 +50*age;

            }

        }


        //•	Ако парите са достатъчно:
        //o	"Yes! He will live a carefree life and will have {N} dollars left." – където N са парите, които ще му останат.
        //•	Ако парите НЕ са достатъчно:
        //o	"He will need {М} dollars to survive." – където M е сумата, която НЕ достига.

        if (money>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }else {

            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
        }

    }
}
