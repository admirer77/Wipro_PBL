package stringBuffer;

public class halfOfString {

    public static String getFirstHalf(String str) {
        if (str.length() % 2 != 0) {
            return null; // Return null for odd length strings
        }
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        System.out.println("First Half (even length): " + getFirstHalf("TomCat"));   // Tom
        System.out.println("First Half (odd length): " + getFirstHalf("Apron"));    // null
    }
}
