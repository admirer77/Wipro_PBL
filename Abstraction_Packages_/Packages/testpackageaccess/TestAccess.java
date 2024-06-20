package testpackageaccess;

import testpackage.Foundation;

public class TestAccess {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();

        // System.out.println("var1: " + foundation.var1);   error: var1 has private access in Foundation
        // System.out.println("var2: " + foundation.var2);   error: var2 is not public in Foundation; cannot be accessed from outside package
        // System.out.println("var3: " + foundation.var3);   error: var3 has protected access in Foundation
        System.out.println("var4: " + foundation.var4); 
    }
}
