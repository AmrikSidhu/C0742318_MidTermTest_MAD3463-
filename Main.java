package com.midterm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reverse String");
        System.out.println("Before");
        System.out.println("Lambton");
        System.out.println("After");
        System.out.println(LambtonStringTools.s("Lambton"));
        System.out.println("Before");
        System.out.println("Toronto College");
        System.out.println("After");
        System.out.println(LambtonStringTools.s("Toronto College"));

        System.out.println(" ");
        System.out.println("Altering Sentence");
        System.out.println("Before");
        System.out.println("Original : the dog jumped over the fence");
        System.out.println("After");
        System.out.println(LambtonStringTools.reversewords("the dog jumped over the fence"));


    }
}
