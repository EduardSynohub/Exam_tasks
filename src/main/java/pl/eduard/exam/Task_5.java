package pl.eduard.exam;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(sphere());
    }

    public static double sphere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius:");

        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter radius:");
            scanner.nextLine();
        }

        double r = scanner.nextDouble();

        return ((double) 4 / 3) * Math.PI * Math.pow(r, 3);
    }
}
