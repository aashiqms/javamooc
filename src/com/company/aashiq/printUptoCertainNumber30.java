package com.company.aashiq;

import java.util.Scanner;

public class printUptoCertainNumber30 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your input ");
        int userInput = Integer.parseInt(input.nextLine());
        for (i=2; i <= userInput; i++) {
            if (i % 2 == 0) {  // if the condition returns as false the program leaves while loop
                System.out.println("the even numbers are " +i);

            }
        }
    }
}
