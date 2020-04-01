package com.company.aashiq;

import java.util.Scanner;

public class leastMethod {
    
    public static int least(int number1, int number2) {
       int result = Math.min(number1, number2);
       if (number1 == number2) {
           Scanner input = new Scanner(System.in);
           System.out.println("enter your choice as 1 or 2");
           int userchoice = Integer.parseInt(input.nextLine());
           switch (userchoice) {
               case 1:
                   result = number1;
                   return result;
               case 2:
                   result = number2;
                   return result;

               default:
                   // throw new IllegalStateException("Unexpected value: " + userchoice);
                   System.out.println("your choice is invalid ");
                   break;
           }
       }
        return result;
    }

    public static void main(String[] args) {
        int answer =  least(3, 7);
        System.out.println("Least: " + answer);
    }

}
