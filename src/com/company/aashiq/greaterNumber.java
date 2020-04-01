package com.company.aashiq;

import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        double number1 = input.nextDouble();
        System.out.println("enter 2nd number: ");
        double number2 = input.nextDouble();
        if (number1 > number2) {
            System.out.println("number 1 is greater");
        }
        else if (number1 < number2){
            System.out.println("number 2 is greater");
        }
        else if (number1 == number2){
            System.out.println("the two numbers are equal");
        }
    }
}
