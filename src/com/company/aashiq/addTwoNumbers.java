package com.company.aashiq;

import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("enter your second number: ");
        int b = Integer.parseInt(reader.nextLine());
        int c = a + b;
        System.out.println("the addition of two number is " + c );
    }


}
