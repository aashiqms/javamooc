package com.company.aashiq;

import java.util.Scanner;

public class sumOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the power ");
        int read = Integer.parseInt(input.nextLine());
        int result = (int)Math.pow(2, read);
        System.out.println("the result is " +result);

    }
}
