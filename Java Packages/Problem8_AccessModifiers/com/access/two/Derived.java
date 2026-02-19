package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccessFromSubclassIndifferentPackage() {
        System.out.println("\nInside Derived class (different package subclass):");
        publicMethod();     // Accessible
        protectedMethod();  // Accessible (via inheritance)
        // defaultMethod(); // Not Accessible (package-private)
        // privateMethod(); // Not Accessible (private)
        
        System.out.println("publicMethod: Accessible");
        System.out.println("protectedMethod: Accessible (via inheritance)");
        System.out.println("defaultMethod: Not Accessible (different package)");
        System.out.println("privateMethod: Not Accessible (same class only)");
    }
}
