package W03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        //banana apple orange grapefruit kiwi pineapple grapes



        if ( day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            switch (fruit) {
                case "banana":
                    double sumBanana = quantity * 2.50;
                    System.out.printf("%.2f", sumBanana);
                    break;
                case "apple":
                    double sumApple = quantity * 1.20;
                    System.out.printf("%.2f", sumApple);
                    break;
                case "orange":
                    double sumOrange = quantity * 0.85;
                    System.out.printf("%.2f", sumOrange);
                    break;
                case "grapefruit":
                    double sumGrapefruit = quantity * 1.45;
                    System.out.printf("%.2f", sumGrapefruit);
                    break;
                case "kiwi":
                    double sumKiwi = quantity * 2.70;
                    System.out.printf("%.2f", sumKiwi);
                    break;
                case "pineapple":
                    double sumPineapple = quantity * 5.50;
                    System.out.printf("%.2f", sumPineapple);
                    break;
                case "grapes":
                    double sumGrapes = quantity * 3.85;
                    System.out.printf("%.2f", sumGrapes);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")){
            switch (fruit) {
                case "banana":
                    double sumBanana = quantity * 2.70;
                    System.out.printf("%.2f", sumBanana);
                    break;
                case "apple":
                    double sumApple = quantity * 1.25;
                    System.out.printf("%.2f", sumApple);
                    break;
                case "orange":
                    double sumOrange = quantity * 0.90;
                    System.out.printf("%.2f", sumOrange);
                    break;
                case "grapefruit":
                    double sumGrapefruit = quantity * 1.60;
                    System.out.printf("%.2f", sumGrapefruit);
                    break;
                case "kiwi":
                    double sumKiwi = quantity * 3.00;
                    System.out.printf("%.2f", sumKiwi);
                    break;
                case "pineapple":
                    double sumPineapple = quantity * 5.60;
                    System.out.printf("%.2f", sumPineapple);
                    break;
                case "grapes":
                    double sumGrapes = quantity * 4.20;
                    System.out.printf("%.2f", sumGrapes);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else {
            System.out.println("error");
        }

    }
}
