package pl.eduard.exam;

public class Task_2 {
    public static void main(String[] args) {
        String test = "Testing text";
        int length = 5;
        int length2 = 10;
        System.out.println(shorten(test, length));
        System.out.println(shorten(test, length2));
    }

    public static String shorten(String str, int length) {
        return str.substring(0, length);
    }
}
