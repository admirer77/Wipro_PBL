package stringBuffer;

public class CombineCharfrom2strings {
        public static String combine(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int maxLength = Math.min(a.length(), b.length());
            for (int i = 0; i < maxLength; i++) {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
            sb.append(a.substring(maxLength));
            sb.append(b.substring(maxLength));
            return sb.toString();
        }

        public static void main(String[] args) {
            System.out.println("Combined Characters: " + combine("Hello", "World")); // HWeolrllod
        }
    }


