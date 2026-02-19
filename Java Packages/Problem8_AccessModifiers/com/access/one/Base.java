package com.access.one;

public class Base {
    public void publicMethod() {
        System.out.println("Base: publicMethod is accessible.");
    }

    protected void protectedMethod() {
        System.out.println("Base: protectedMethod is accessible.");
    }

    void defaultMethod() {
        System.out.println("Base: defaultMethod is accessible.");
    }

    private void privateMethod() {
        System.out.println("Base: privateMethod is accessible.");
    }
    
    public void testAccess() {
        System.out.println("Inside Base class:");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
