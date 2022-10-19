package W05_WhileLoop.Exercises;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maxLowGrade = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int countLowGrade = 0;
        double sumGrade = 0;
        int problemsCount = 0;
        String lastProblemName = "";

        while (!input.equals("Enough")){
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade<=4){
                countLowGrade++;
            }
            if (countLowGrade>=maxLowGrade){
                break;
            }

            problemsCount++;
            sumGrade+=grade;
            lastProblemName = problemName;

            input = scanner.nextLine();
        }

        if(countLowGrade==maxLowGrade){
            System.out.printf("You need a break, %d poor grades.", countLowGrade);
        }else {

            System.out.printf("Average score: %.2f%n", sumGrade / problemsCount);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblemName);
        }
    }
}
