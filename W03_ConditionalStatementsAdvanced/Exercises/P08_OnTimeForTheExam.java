package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Първият ред съдържа час на изпита – цяло число от 0 до 23.
        // Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        // Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        // Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());



        //Студент трябва да отиде на изпит в определен час. Той идва в изпитната зала в даден час на пристигане.
        //Счита се, че студентът е дошъл навреме, ако е пристигнал в часа на изпита или до половин час преди това.
        //Ако е пристигнал по-рано повече от 30 минути, той е подранил. Ако е дошъл след часа на изпита, той е
        //закъснял. Напишете програма, която прочита време на изпит и време на пристигане и отпечатва дали
        //студентът е дошъл навреме, дали е подранил или е закъснял и с колко часа или минути е подранил или закъснял.


        //На първият ред отпечатайте:
        // “Late”, ако студентът пристига по-късно от часа на изпита.
        // “On time”, ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
        // “Early”, ако студентът пристига повече от 30 минути преди часа на изпита.
        //Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:

        int totalExamMinutes = (examHour*60) + examMinute;
        int totalArrivalMinutes = (arrivalHour*60) + arrivalMinute;
        int diff = Math.abs(totalExamMinutes-totalArrivalMinutes);

        int hours = 0;
        int minutes = 0;



        if(totalArrivalMinutes>totalExamMinutes) {
            System.out.println("late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                hours = diff / 60;
                minutes = diff % 60;
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours after the start", hours, minutes);
                }
            }
        }else if (totalExamMinutes==totalArrivalMinutes || diff<=30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diff);
            }
        }else{
            if (diff<60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", diff);
            }else{
                hours = diff / 60;
                minutes = diff % 60;
                System.out.println("Early");
                if (minutes<10){
                    System.out.printf("%d:0%d hours before the start", hours, minutes);
                }else {
                    System.out.printf("%d:%d hours before the start", hours, minutes);
                }
            }
        }


    }
}
