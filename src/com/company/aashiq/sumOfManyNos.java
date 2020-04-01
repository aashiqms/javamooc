package com.company.aashiq;

import java.util.Scanner;

public class sumOfManyNos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;  // break statement take program to the end of while loop
            }

                   sum += read;
            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);


    }
}
