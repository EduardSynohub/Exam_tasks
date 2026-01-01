package pl.eduard.exam;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(div(10, 100)));
            System.out.println(Arrays.toString(div(10, -50)));
        } catch (IllegalArgumentException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static int[] div(int size, int interval) {
        if (interval < 3) {
            throw new IllegalArgumentException("Interval cannot be less than 2!!!");
        }
        int[] newIntArray = new int[size];
        Random randomizer = new Random();

        for (int i = 0; i < newIntArray.length; i++) {
            int randomNumber = randomizer.nextInt(1, interval);
            if (randomNumber % 2 == 0 && randomNumber % 3 != 0) {
                newIntArray[i] = randomNumber;
            } else {
                i--;
            }
        }

        return newIntArray;
    }
}
