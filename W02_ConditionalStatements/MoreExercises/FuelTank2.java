package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//•	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
//•	Количество гориво – реално число в интервала [1.00 … 50.00]
//•	Притежание на клубна карта – текст с възможности: "Yes" или "No"

        String fuelType = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();


//Напишете програма, която да изчислява, колко ще струва на един шофьор да напълни резервоара на автомобила си,
//като знаете – какъв тип гориво зарежда, каква е цената за литър гориво и дали разполага с карта за отстъпки.

//Ако водача има карта за отстъпки,  той се възползва от следните намаления за литър гориво:
// 18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
//Ако шофьора е заредил между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната цена,
// при повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.

//•	Бензин – 2.22 лева за един литър,
//•	Дизел – 2.33 лева за един литър
//•	Газ – 0.93 лева за литър


        double gasolineSum = litersFuel*2.22;
        double dieselSum = litersFuel*2.33;
        double gasSum = litersFuel*0.93;

        double gasolineSumDiscount = litersFuel*2.04;
        double dieselSumDiscount = litersFuel*2.21;
        double gasSumDiscount = litersFuel*0.85;

        if (clubCard.equals("Yes")){
            if (litersFuel>=20 && litersFuel<=25){
                switch (fuelType) {
                    case "Gasoline":
                        double totalSum1 = gasolineSumDiscount * 0.92;
                        System.out.printf("%.2f lv.", totalSum1);
                        break;
                    case "Diesel":
                        double totalSum2 = dieselSumDiscount * 0.92;
                        System.out.printf("%.2f lv.", totalSum2);
                        break;
                    case "Gas":
                        double totalSum3 = gasSumDiscount * 0.92;
                        System.out.printf("%.2f lv.", totalSum3);
                        break;

                }
            } else if(litersFuel>25){
                switch (fuelType) {
                    case "Gasoline":
                        double totalSum1 = gasolineSumDiscount * 0.90;
                        System.out.printf("%.2f lv.", totalSum1);
                        break;
                    case "Diesel":
                        double totalSum2 = dieselSumDiscount * 0.90;
                        System.out.printf("%.2f lv.", totalSum2);
                        break;
                    case "Gas":
                        double totalSum3 = gasSumDiscount * 0.90;
                        System.out.printf("%.2f lv.", totalSum3);
                        break;

                }



            }else {
                switch (fuelType) {
                    case "Gasoline":
                        System.out.printf("%.2f lv.", gasolineSumDiscount);
                        break;
                    case "Diesel":
                        System.out.printf("%.2f lv.", dieselSumDiscount);
                        break;
                    case "Gas":
                        System.out.printf("%.2f lv.", gasSumDiscount);
                        break;

                }
            }

        } else {
            if (litersFuel>=20 && litersFuel<=25){
                switch (fuelType) {
                    case "Gasoline":
                        double totalSum1 = gasolineSum * 0.92;
                        System.out.printf("%.2f lv.", totalSum1);
                        break;
                    case "Diesel":
                        double totalSum2 = dieselSum * 0.92;
                        System.out.printf("%.2f lv.", totalSum2);
                        break;
                    case "Gas":
                        double totalSum3 = gasSum * 0.92;
                        System.out.printf("%.2f lv.", totalSum3);
                        break;

                }
            } else if(litersFuel>25){
                switch (fuelType) {
                    case "Gasoline":
                        double totalSum1 = gasolineSum * 0.90;
                        System.out.printf("%.2f lv.", totalSum1);
                        break;
                    case "Diesel":
                        double totalSum2 = dieselSum * 0.90;
                        System.out.printf("%.2f lv.", totalSum2);
                        break;
                    case "Gas":
                        double totalSum3 = gasSum * 0.90;
                        System.out.printf("%.2f lv.", totalSum3);
                        break;

                }



            }else {
                switch (fuelType) {
                    case "Gasoline":
                        System.out.printf("%.2f lv.", gasolineSum);
                        break;
                    case "Diesel":
                        System.out.printf("%.2f lv.", dieselSum);
                        break;
                    case "Gas":
                        System.out.printf("%.2f lv.", gasSum);
                        break;

                }
            }

        }







    }
}
