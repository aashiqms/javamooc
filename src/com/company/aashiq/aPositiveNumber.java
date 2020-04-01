package com.company.aashiq;

import java.util.Scanner;

public class aPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:" );
                long number = input.nextLong();
       if (number >= 0 ){
           System.out.println("the number is positive");
       } else {
           System.out.println("the number is negative");
       }

    }
}
