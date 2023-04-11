package com.driver;

class A {
    public String meth() {

        return "Invoking method from class A";
    }
}

// Task 2: create class B which extends class A
class B extends A {
    // Task 4: override method meth in class B
  @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
     public static void main(String[] args) {
        B obj = new B();

        // calling overridden method meth of class B
       obj.meth();


    }
}
