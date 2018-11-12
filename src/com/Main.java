package com;

public class Main {
    final int i = 1;


    public static void main(String[] args) {
        One one=new Two();
        one.executeMethod();
    }
}
class One{
    private final void method(){
        System.out.println("one");
    }
    void executeMethod(){
        One one=new Two();
        one.method();
    }
}

class Two extends One{

    void method(){
        System.out.println("two");
    }
}