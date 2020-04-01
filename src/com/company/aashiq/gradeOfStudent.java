package com.company.aashiq;

import java.util.Scanner;

public class gradeOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the student's mark: ");
        double mark = input.nextDouble();
        if (mark < 0 ){
            System.out.println("invalid input");
        } else if (mark > 0 && mark < 30 ) {  // may have used <= 29
            System.out.println("fail");
        }
        else if (mark > 29 && mark < 35 ) {
            System.out.println("the student got 1 point");
        }
        else if (mark > 34 && mark < 40 ) {
            System.out.println("the stundent has got 2 points");
        }
    }
}
