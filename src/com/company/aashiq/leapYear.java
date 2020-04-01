package com.company.aashiq;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
     double leapyear = year % 4;
     double leap100 = year % 100;
     double leap400 = year % 400;
     if (leapyear == 0) {
         System.out.println("The year is leap year");
     } else if (leap100 == 0 && leap400 == 0) {
         System.out.println("the year is leap year");
     } else {
         System.out.println("Not leap Year");
     }
}
}
