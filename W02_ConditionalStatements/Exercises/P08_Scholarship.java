package W02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P08_Scholarship {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Потребителят въвежда 3 числа, по едно на ред:
        //1. Доход в лева - реално число в интервала [0.00..6000.00]
        //2. Среден успех - реално число в интервала [2.00...6.00]
        //3. Минимална работна заплата - реално число в интервала [0.00..1000.00]

        double income = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        //Учениците могат да кандидатстват за социална стипендия или за стипендия за отличен успех. Изискване за
        //социална стипендия - доход на член от семейството по-малък от минималната работна заплата и успех над
        //4.5. Размер на социалната стипендия - 35% от минималната работна заплата. Изискване за стипендия за
        //отличен успех - успех над 5.5, включително. Размер на стипендията за отличен успех - успехът на ученика,
        //умножен по коефициент 25.
        //Напишете програма, която при въведени доход, успех и минимална работна заплата, дава информация дали
        //ученик има право да получава стипендия, и стойността на стипендията, която е по-висока за него.

        double socialScholarship = Math.floor(minSalary*0.35);
        double greatSuccess = Math.floor(averageSuccess*25);



        // Ако ученикът няма право да получава стипендия, се извежда:
        //"You cannot get a scholarship";
        //Ако ученикът има право да получава социална стипендия и тя е по-висока от стипендията за отличен успех:
        //"You get a Social scholarship {стойност на стипендия} BGN";
        // Ако ученикът има право да получава стипендия за отличен успех и тя е по-висока или равна по
        //стойност на социалната стипендия за него:
        //"You get a scholarship for excellent results {стойност на стипендията} BGN";

        if (income>=minSalary && averageSuccess<5.50){
            System.out.println("You cannot get a scholarship!");
        }else if(income<minSalary && averageSuccess>=4.50 && averageSuccess<5.50){

            System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);

        }else if(averageSuccess>=5.50 && greatSuccess>=socialScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",greatSuccess);

        }else if(averageSuccess>=5.50 && greatSuccess<socialScholarship){
            System.out.printf("&quot;You get a Social scholarship %.0f BGN",socialScholarship);

        }





    }
}
