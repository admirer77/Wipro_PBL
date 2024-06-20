package stringBuffer;

public class palimdrome {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Empty string is considered a palindrome
        }

        StringBuffer reversed = new StringBuffer(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String original = "racecar";
        String notPalindrome = "hello";

        System.out.println(original + " is palindrome: " + isPalindrome(original));
        System.out.println(notPalindrome + " is palindrome: " + isPalindrome(notPalindrome));
    }
}
