package pl.eduard.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnTab()));
    }

    public static int[] returnTab() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a size of table:");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a size of table: ");
            scanner.nextLine();
        }

        int sizeOfTable = scanner.nextInt();
        int[] numTab = new int[sizeOfTable];
        for (int i = 0; i < numTab.length; i++) {
            numTab[i] = i + 1;
        }

        return numTab;
    }
}
