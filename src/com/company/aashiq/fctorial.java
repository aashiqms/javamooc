package com.company.aashiq;

import java.util.Scanner;

public class fctorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int read = Integer.parseInt(input.nextLine());
        int factorial = 1;
        for (int i = 1; i <= read ; i++) {
            factorial = factorial * i;
                    System.out.println("the result is " + factorial);

        }
    }
}
