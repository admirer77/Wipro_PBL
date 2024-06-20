package stringBuffer;

public class removexFromBeginningAndEnd {
        public static String removeX(String str) {
            if (str.length() < 2) {
                return str; // Handle strings with less than 2 characters
            }
            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length() - 1);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length() - 1);
            } else {
                return str;
            }
        }

        public static void main(String[] args) {
            System.out.println("After removing 'x': " + removeX("xHix")); // Hi
            System.out.println("After removing 'x': " + removeX("America")); // America
        }
    }


