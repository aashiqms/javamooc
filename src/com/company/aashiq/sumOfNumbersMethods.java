package com.company.aashiq;

import java.util.Scanner;

public class sumOfNumbersMethods {
    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }
    public static int sum(int number1, int number2, int number3, int number4) {
        // write program code here
        int result = number1 + number2 + number3 + number4;
        return result;

        // remember that the method needs a return in the end
    }
}
