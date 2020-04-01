package com.company.aashiq;

import java.util.Scanner;

public class calculatorAppDbDb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operation to be performed " +
                    "+" +
                    " or " +
                    "-" +
                    " or " +
                    "/" +
                    " or " +
                    "*" +
                    " or " +
                    "%" +
                    " or " +
                    "quit");
            String userOperation = input.nextLine();
            if (userOperation.equals("quit")) {
                break;  // the while loop if the program enters this line.
            }
            System.out.println("Enter the numbers");
            double number1 = Double.parseDouble(input.nextLine()); /* ??????? difference between
            input.nextdouble()
            and Double.parseDouble(input.nextLine())  ?????????? */
            double number2 = Double.parseDouble(input.nextLine());
            if (userOperation.equals("+")) {
                double resultOfAddition = number1 + number2;
                System.out.println("the result is " +resultOfAddition);
            } else if (userOperation.equals("-")) {
                double resultOfSubtraction = number1 - number2;
                System.out.println("the result is "+resultOfSubtraction);
            } else if (userOperation.equals("/")) {
                double resultOfDivision = number1 / number2;
                System.out.println("the result is " +resultOfDivision);
            } else if (userOperation.equals("*")) {
                double resultOfMultiplication = number1 * number2;
                System.out.println("the result is " +resultOfMultiplication);
            } else if (userOperation.equals("%")) {
                double resultOfModulo = number1 % number2;
                System.out.println("the result is " +resultOfModulo);
            } else {
                System.out.println("invalid parameter ");
            } }
        }
    }
