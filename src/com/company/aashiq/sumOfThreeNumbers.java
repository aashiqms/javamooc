package com.company.aashiq;

import java.util.Scanner;

public class sumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.print("enter the first number ");
        read = Integer.parseInt(input.nextLine());
        sum += read;
        System.out.print("enter the second number ");
        read = Integer.parseInt(input.nextLine());
        sum += read;
        System.out.print("enter the third number ");
        read = Integer.parseInt(input.nextLine());
        sum += read;
        System.out.println("sum is " +sum);

    }
}

/*
package com.company.aashiq;
        import java.util.Scanner;
 use while statement
 Use a helper variable in your program to remember how many times the block has been executed.
 Use also another helper variable to store the sum
 During each execution add the value of the helper variable that counts the executions to the variable in which you should collect the sum.


public class sumOfsetOfNumbers {

    public class TheSumOfSetOfNumbers {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int number = 0;
            int untilWhat;
            int sum=0;
            System.out.println("Until what :");
            untilWhat = reader.nextInt();
            while (number<=untilWhat){
                sum+=number;
                number++;
                System.out.println(sum);

            }


        }
    }

}
 */
