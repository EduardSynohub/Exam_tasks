package pl.eduard.exam;

public class Task_6 {
    public static void main(String[] args) {
        String text = "Some text, to check method, some text and text.";
        String forReplace = "text";
        String replacement = "doodle";
        System.out.println(replaceStr(text, forReplace, replacement));
    }

    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replaceAll(forReplace, replacement);
    }
}
