package stringBuffer;

public class stringCombiner {
    public static String combine(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public static void main(String[] args) {
        System.out.println("Combined String: " + combine("hi", "hello")); // hihellohi
    }
}
