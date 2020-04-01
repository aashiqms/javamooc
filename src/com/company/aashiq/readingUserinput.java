package com.company.aashiq;
import java.util.Scanner;
public class readingUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("who is he: ");
                String name = input.nextLine();
        System.out.println("your name is: " + name);
        System.out.println("enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("your age is: " + age);
    }
}

