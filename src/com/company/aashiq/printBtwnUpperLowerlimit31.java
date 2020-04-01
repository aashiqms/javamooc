package com.company.aashiq;

import java.util.Scanner;

public class printBtwnUpperLowerlimit31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter upper limit ");
       double upperLimit = Double.parseDouble(input.nextLine());
        System.out.println("enter lower limit ");
        double lowerLimit = Double.parseDouble(input.nextLine());
        while (true) {
            if (lowerLimit > upperLimit) {
                break;
            }
            System.out.println(lowerLimit++);

        }

    }
}
