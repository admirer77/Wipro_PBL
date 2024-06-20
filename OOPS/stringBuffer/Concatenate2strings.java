package stringBuffer;

public class Concatenate2strings {

    public static String concatenate(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1.toLowerCase());
        if (str1.length() > 0 && str2.length() > 0 && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            sb.append(str2.substring(1).toLowerCase());
        } else {
            sb.append(str2.toLowerCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Concatenated (lowercase, omit duplicate): " + concatenate("Sachin", "Tendulkar")); // sachin tendulkar
        System.out.println("Concatenated (lowercase, omit duplicate): " + concatenate("Mark", "kate"));  // markate
    }
}
