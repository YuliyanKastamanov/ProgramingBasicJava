package W05_WhileLoop.Lab;

import java.util.Scanner;

public class P08_GraduationPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        double totalScore = 0;
        int rejectCounter = 0;

        while (grade <= 12){
            double score = Double.parseDouble(scanner.nextLine());

            if(score<4){
                rejectCounter++;
                if (rejectCounter == 2){
                    break;
                }

                continue;
            }

            totalScore += score;
            grade ++;


        }
        if(rejectCounter == 2){
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            double averageGrade = totalScore/12;
            System.out.printf("%s graduated. Average grade: %.2f",name, averageGrade);
        }






    }
}
