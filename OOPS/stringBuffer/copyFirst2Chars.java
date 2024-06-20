package stringBuffer;

public class copyFirst2Chars {

    public static String repeat(String str) {
        if (str.length() < 2) {
            return str; // Handle strings with less than 2 characters
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, 2));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Repeated First Two Chars: " + repeat("Wipro")); // WiWiWiWiWi
    }
}

