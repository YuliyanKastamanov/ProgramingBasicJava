package W02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int poolVolume = Integer.parseInt(scanner.nextLine());
        int flowP1 = Integer.parseInt(scanner.nextLine());
        int flowP2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double volumeP1 = flowP1*time;
        double volumeP2 = flowP2*time;

        double poolVolumeFinal = volumeP1+volumeP2;

        double percentWaterPool = (poolVolumeFinal*100)/poolVolume;
        double percentWaterP1 = (volumeP1*100)/poolVolumeFinal;
        double percentWaterP2 = (volumeP2*100)/poolVolumeFinal;
        double overflow = poolVolumeFinal-poolVolume;

        if (poolVolumeFinal<=poolVolume){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentWaterPool,percentWaterP1,percentWaterP2);
        }else {

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, overflow);
        }
        }

    }