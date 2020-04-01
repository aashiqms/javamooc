package com.company.aashiq;

import java.util.Scanner;

public class circumferenceOfCircle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("enter the radies: ");
        double radius = Double.parseDouble(reader.nextLine());
        double circumference = 2 * pi * radius;
        System.out.println("the circumference of circle is: "+circumference);

    }
}
