package com.company.aashiq;

import java.util.Scanner;

public class manyPrints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many times ");
        int read = Integer.parseInt(input.nextLine());
       int a = 1;
        while (a <= read) {
            a++;
            printtext();

        }

    }
    public static void printtext(){
        System.out.println("my name is aashiq ");
    }
}