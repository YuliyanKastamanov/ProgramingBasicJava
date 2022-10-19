package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentNoPainting = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSqM = Math.ceil(4.0 * height*1.0 * width*1.0 * (1.0 - percentNoPainting*1.0 / 100.0));

        while (!(input.equals("Tired!"))) {
            int litresPaint = Integer.parseInt(input);

            totalSqM -= litresPaint*1.0;

            if (totalSqM < 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (totalSqM > 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", totalSqM);
        } else if (totalSqM == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("%.0f quadratic m left.", Math.abs(totalSqM));
        }
    }




    }




