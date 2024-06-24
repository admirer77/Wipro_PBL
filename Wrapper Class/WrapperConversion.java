public class WrapperConversion {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("original"+number);
        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);
    
        System.out.println("Binary"+binary);
        System.out.println("Hexa:"+hex);
        System.out.println("octal:"+octal);
    }
    
}
