package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class    P04_VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на входа

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        //Изчисления 1. Общото време за четене, 2. Необходимите часове за четене за ден

        int neededHours = pages/pagesPerHour;
        int neededHoursPerDay = neededHours/days;

        //Принтиране

        System.out.println(neededHoursPerDay);
    }
}
