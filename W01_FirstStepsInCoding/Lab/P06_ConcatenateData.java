package W01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P06_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // създаване на променливи за имената, години и град

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // Принтиране

        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
