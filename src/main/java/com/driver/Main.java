package com.driver;


public class Main {
   public static class A {
    public String meth() {

        return "Invoking method from class A";
    }
}

// Task 2: create class B which extends class A
   public static class B extends A {
    // Task 4: override method meth in class B
   @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
     public static void main(String[] args) {
            B b = new B();
             b.meth();
    }
}
