package W05_WhileLoop.Lab;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();



        String inputPassword = scanner.nextLine();


        while (!inputPassword.equals(password)) {
            inputPassword=scanner.nextLine();
        }

        System.out.printf("Welcome %s!",userName);

    }
}
