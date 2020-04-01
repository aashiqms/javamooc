package com.company.aashiq;

import java.util.Scanner;

public class ageofMajority {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = input.nextInt();
        if (age >= 18 ) {
            System.out.println("you are major");
        } else {
            System.out.println("you are minor");
        }


    }
}
