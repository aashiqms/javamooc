package com.company.aashiq;

import java.util.Scanner;

public class loopEndingAndRemembering {
    public static void main(String[] args) {
        int sum = 0;
        int numbers = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (numbers >= 0) {
            System.out.println("the the number");
            numbers = Integer.parseInt(input.nextLine());
            sum = sum + numbers;
            System.out.println("the sum is "+sum);
            counter = counter + 1;
            if (numbers == -1) {
                System.out.println("thank you see you again");
                counter = counter - 1;
                System.out.println("how many numbers " + counter);
                break;
            }
            System.out.println("how many numbers " + counter);

        }

    }
}
