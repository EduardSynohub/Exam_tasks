package pl.eduard.exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_8 {
    public static String FILE_NAME = "exam.txt";
    public static String FILE_NAME_EXAM_PASSED = "exam_passed.txt";
    public static void main(String[] args) {
        create(100);
    }

    public static void create(int max) {
        List<String> studentsWhoPassed = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many students do you have in your group:");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter how many students do you have in your group:");
            scanner.next();
        }
        int studentsInGroup = scanner.nextInt();
        scanner.nextLine();

        List<String> studentsData = new ArrayList<>(studentsInGroup);

        for (int i = 0; i < studentsInGroup; i++) {
            System.out.println("Enter login for student #" + (i + 1));
            String login = scanner.nextLine();

            int points;
            while (true) {
                System.out.println("Enter points for student #" + (i + 1));
                if (scanner.hasNextInt()) {
                    points = scanner.nextInt();
                    if (points >= 0 && points <= 100) {
                        break;
                    }
                }
                System.out.println("Please enter correct amount of points!");
                scanner.next();
            }

            scanner.nextLine();
            studentsData.add(login + " " + points);
        }

        saveDataIntoFile(studentsData, FILE_NAME);
        List<String> studentsListFromExam = readDataFromFile(FILE_NAME);

        for (int i = 0; i < studentsListFromExam.size(); i++) {
            String[] strings = studentsListFromExam.get(i).split(" ");
            int points = Integer.parseInt(strings[1]);

            if (points >= (max * 0.6)) {
                studentsWhoPassed.add(studentsListFromExam.get(i));
            }
        }
        saveDataIntoFile(studentsWhoPassed, FILE_NAME_EXAM_PASSED);
    }

    public static void saveDataIntoFile(List<String> dataForSave, String filename) {
        try (PrintWriter printWriter = new PrintWriter(filename)) {
            for (String s : dataForSave) {
                printWriter.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static List<String> readDataFromFile(String filename) {
        List<String> lines = null;
        Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            System.out.println("Ooops, file doesn't exist");
        }

        try {
            lines =  Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        return lines;
    }


}
