package com.company.aashiq;

import java.util.Scanner;
// we may also use for loop   for(i=2;i<=100;i+=2)
public class printEvennumbers29 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        for (i=2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("the even numbers are " +i);

            }
        }
    }
}
