package stringBuffer;

public class withoutFirstLastChar {

    public static String remove(String str) {
        if (str.length() <= 1) {
            return ""; // Return empty string for strings with 0 or 1 character
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println("Removed First and Last Char: " + remove("Suman")); // uma
    }
}
