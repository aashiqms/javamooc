package com.company.aashiq;

public class printOneToHundred27 {
    public static void main(String[] args) {
        int sum = 1;
        while(true) {
            if (sum > 100) {
                break;
            }
            int i = sum++;
            System.out.println("the sum is "+i );
        }
    }
}
