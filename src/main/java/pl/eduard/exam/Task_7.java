package pl.eduard.exam;


public class Task_7 {
    public static void main(String[] args) {
        String test = "1 plus 2 equals 3";
        System.out.println(countNumbers(test));
    }

    public static int countNumbers(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }
}