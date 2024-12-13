package com.example1;
public class HelloWorld {
    public void greet(){
        System.out.println("Hello from the com.example package");
    }
    public static void main(String[] args) {
        com.example1.HelloWorld hello=new com.example1.HelloWorld();
        hello.greet();
    }
}
