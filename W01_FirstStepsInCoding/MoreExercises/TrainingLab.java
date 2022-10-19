package W01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());


        double desksPerRow = (width - 1)/0.7;

        double rows = (length)/1.2;

        double desksFinal = Math.floor(desksPerRow);
        double rowsFinal = Math.floor(rows);

        double allDesks = desksFinal*rowsFinal -3;


        System.out.printf("%.0f", allDesks);




    }
}
