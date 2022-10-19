package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        //Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена
        //математическа операция с тях. Възможните операции са: Събиране(+), Изваждане(-), Умножение(*),
        //Деление(/) и Модулно деление(%). При събиране, изваждане и умножение на конзолата трябва да се
        //отпечатат резултата и дали той е четен или нечетен. При обикновеното деление – резултата. При модулното
        //деление – остатъка. Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се
        //дели. В този случай трябва да се отпечата специално съобщениe.

        double result = 0;

        if (number2==0){
            System.out.printf("Cannot divide %d by zero",number1);
        } else {

            if (operator.equals("+")) {
                result = number1 + number2;
            } else if (operator.equals("-")) {
                result = (number1 - number2);
            } else if (operator.equals("*")) {
                result = number1 * number2;
            } else if (operator.equals("/")) {
                result = (number1*1.0)/number2;
            } else if (operator.equals("%")) {
                result = number1 % number2;
            }


            if(operator.equals("+") || operator.equals("-") || operator.equals("*")){
                if (result % 2 ==0){
                    System.out.printf("%d %s %d = %.0f - even", number1, operator, number2, result);
                }else{
                    System.out.printf("%d %s %d = %.0f - odd", number1, operator, number2, result);
                }

            }else if(operator.equals("/")){
                System.out.printf("%d / %d = %.2f",number1, number2, result);
            }else if (operator.equals("%")){
                System.out.printf("%d %% %d = %.0f", number1, number2, result);
            }
        }




    }
}
