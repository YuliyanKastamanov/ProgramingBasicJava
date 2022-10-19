package W02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSecondPerMeter = Double.parseDouble(scanner.nextLine());

        // Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
        // съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        // Когато се изчислява колко пъти Иван ще се забави, в резултат на съпротивлението на водата,
        //резултатът трябва да се закръгли надолу до най-близкото цяло число.


        double totalDistanceSeconds = distanceMeters*timeSecondPerMeter;

        double plusSeconds = (Math.floor(distanceMeters/15))*12.5;

        double totalTime = totalDistanceSeconds + plusSeconds;
        //Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния
        //рекорд.
        //  Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
        // "Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
        //"No, he failed! He was {недостигащите секунди} seconds slower."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.
        double diff = Math.abs(totalTime-currentRecord);

        if (totalTime<currentRecord){

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }else if (totalTime>=currentRecord){
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }

    }

}
