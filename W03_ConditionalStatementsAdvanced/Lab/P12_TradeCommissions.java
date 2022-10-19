package W03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());

        // Обем на продажбите "s"

        //Град	0 ≤ s ≤ 500;  500 < s ≤ 1 000	 1 000 < s ≤ 10 000   	s > 10 000
        //Sofia	    5%              7%	                 8%	       	    12%
        //Varna		4.5%	 	    7.5%				10%			    13%
        //Plovdiv	5.5%	 	    8%					 12%			14.5%

        double commission = 0;



        if (town.equals("Sofia")){
            if(salesVolume>0 && salesVolume<=500){
                commission = salesVolume*0.05;
                System.out.printf("%.2f",commission);
            } else if(salesVolume>500 && salesVolume<=1000){
                commission = salesVolume*0.07;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>1000 && salesVolume<=10000){
                commission = salesVolume*0.08;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>10000){
                commission = salesVolume*0.12;
                System.out.printf("%.2f",commission);
            }else {
                System.out.printf("error");
            }
        }else if (town.equals("Varna")){
            if(salesVolume>=1 && salesVolume<=500){
                commission = salesVolume*0.045;
                System.out.printf("%.2f",commission);
            } else if(salesVolume>500 && salesVolume<=1000){
                commission = salesVolume*0.075;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>1000 && salesVolume<=10000){
                commission = salesVolume*0.10;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>10000){
                commission = salesVolume*0.13;
                System.out.printf("%.2f",commission);
            }else {
                System.out.printf("error");
            }
        }else if(town.equals("Plovdiv")){
            if(salesVolume>=1 && salesVolume<=500){
                commission = salesVolume*0.055;
                System.out.printf("%.2f",commission);
            } else if(salesVolume>500 && salesVolume<=1000){
                commission = salesVolume*0.08;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>1000 && salesVolume<=10000){
                commission = salesVolume*0.12;
                System.out.printf("%.2f",commission);
            }else if(salesVolume>10000){
                commission = salesVolume*0.145;
                System.out.printf("%.2f",commission);
            }else {
                System.out.printf("error");
            }
        }else {
            System.out.printf("error");
        }

    }
}
