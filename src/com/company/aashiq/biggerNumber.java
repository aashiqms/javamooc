package com.company.aashiq;

import java.util.Scanner;

public class biggerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int numberone = input.nextInt();
        System.out.println("enter your second number: ");
        int numbertwo = input.nextInt();
        int biggerNumber = Math.max(numberone, numbertwo);
        System.out.println("the bigger number is "+biggerNumber);
    }
}
