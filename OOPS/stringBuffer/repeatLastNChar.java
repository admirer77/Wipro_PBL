package stringBuffer;

public class repeatLastNChar {
        public static String repeat(String str, int n) {
            if (n == 0) {
                return ""; // Handle n being 0
            }
            String lastN = str.substring(str.length() - Math.min(n, str.length()));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(lastN);
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println("Repeated Last Characters: " + repeat("Wipro", 3)); // pro pro pro
        }
    }

