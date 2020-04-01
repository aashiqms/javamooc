package com.company.aashiq;

import java.util.Scanner;

public class lengthOfName {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
int a = name.length();
        System.out.println("the legnth of characters is " +a);
    }
}