package W01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P08_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от
        // конзолата на отделни редове размерите му – дължина, широчина и височина в сантиметри. Трябва да се
        //пресметне колко литра вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е
        //заета от пясък, растения, нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм 3 /.

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        //Пресмятане 1. Обема на аквариума, 2. Общо литри, които ще събере аквариума, 3. процент зает от пясък, растения, нагревател и помпа, 4. Реалните литри;



        int volume = length * width * height;
        double fullTankLiters = volume * 1/1000.0;
        double realPercent = percent * 1/100;
        double realTankLiters = fullTankLiters * (1-realPercent);

        //Принтиране до втората цифра след десетичната запетая.

        System.out.printf("%.2f", realTankLiters);

    }
}
