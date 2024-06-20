package stringBuffer;

public class RemoveCharactersaroundStar {

    public static String remove(String str) {
        int starIndex = str.indexOf('*');
        if (starIndex == -1) {
            return str; // No '*' found
        }
        if (starIndex == 0) {
            return str.substring(starIndex + 1); // Remove from beginning
        } else if (starIndex == str.length() - 1) {
            return str.substring(0, starIndex); // Remove from end
        } else {
            return str.substring(0, starIndex) + str.substring(starIndex + 1); // Remove both sides
        }
    }

    public static void main(String[] args) {
        System.out.println("After removing around '*': " + remove("ab*cd")); // ad
    }
}

