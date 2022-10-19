package W03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P09_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidaysP = Integer.parseInt(scanner.nextLine()); //брой празници в годината (които не са събота и неделя).
        int weekendsHome = Integer.parseInt(scanner.nextLine()); //брой уикенди, в които Влади си пътува до родния град.

        // Първият ред съдържа думата leap (високосна година) или normal (невисокосна).
        // Вторият ред съдържа цялото число p – брой празници в годината (които не са събота и неделя).
        // Третият ред съдържа цялото число h – брой уикенди, в които Влади си пътува до родния град.

        //Влади е студент, живее в София и си ходи от време на време до родния град. Той е много запален по
        //волейбола, но е зает през работните дни и играе волейбол само през уикендите и в празничните дни. Влади
        //играе в София всяка събота, когато не е на работа и не си пътува до родния град, както и в 2/3 от
        //празничните дни. Той пътува до родния си град h пъти в годината, където играе волейбол със старите си
        //приятели в неделя. Влади не е на работа 3/4 от уикендите, в които е в София. Отделно, през високосните
        //години Влади играе с 15% повече волейбол от нормалното. Приемаме, че годината има точно 48 уикенда,
        //подходящи за волейбол.
        //Напишете програма, която изчислява колко пъти Влади е играл волейбол през годината. Закръглете
        //резултата надолу до най-близкото цяло число (например 2.15  2; 9.95  9).
        //Входните данни се въвеждат от потребителя, в следния вид:
         double weekendsSofia = 48 - weekendsHome;
         double freeWeekendsSofia = weekendsSofia * 3.0/4;
         double holidaysPlaying  = holidaysP * 2.0/3;
         double allDaysForPlaying = weekendsHome + freeWeekendsSofia + holidaysPlaying;
         double totalDaysLeap = Math.floor(allDaysForPlaying + allDaysForPlaying*0.15);
         double totalDaysNormal = Math.floor(allDaysForPlaying);

         if (year.equals("leap")){


             System.out.printf("%.0f",totalDaysLeap);
         }else if(year.equals("normal")){

             System.out.printf("%.0f",totalDaysNormal);

         }







    }
}
