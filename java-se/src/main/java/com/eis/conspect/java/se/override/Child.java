package com.eis.conspect.java.se.override;

class Parent{

    void test(){
        System.out.println("... from Parent");
    }
}

public class Child extends Parent{

    @Override
    void test(){
        System.out.println("... from Child");
    }

    void testSup(){
        super.test();
    }

    public static void main(String[] args) {

        Child child = new Child();
        child.test();

        Parent parent = new Parent();
        parent.test();

        parent = child; // Parent parent = new Child();
        parent.test();

        child.testSup();

//        parent.testSup();


    }
}
