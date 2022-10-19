package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        //Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.

        //•	Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
        //•	Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        if (kilometers>=20 && kilometers<100){
            double priceBus = kilometers*0.09;
            System.out.printf("%.2f",priceBus);
        } else if (kilometers>=100){

            double priceTrain = kilometers*0.06;
            System.out.printf("%.2f",priceTrain);
        }else {
            if(dayOrNight.equals("day")){

                double priceTaxi1 = 0.70+(kilometers*0.79);
                System.out.printf("%.2f",priceTaxi1);

            } else if(dayOrNight.equals("night")){
                double priceTaxi2 = 0.7+(kilometers*0.90);
                System.out.printf("%.2f",priceTaxi2);
            }

        }



    }
}
