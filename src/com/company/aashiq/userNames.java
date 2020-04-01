package com.company.aashiq;

import java.util.Scanner;

public class userNames {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter your username: ");
        String userName = input.nextLine();
        System.out.println("enter your password");
        String password = input.nextLine();
        if (userName.equals("aashiqms") && password.equals("Newcool")) {
            System.out.println("Welcome to this site " +userName);
        } else if (userName.equals("cat1") && password.equals("Newone")) {
            System.out.println("Welcome to this site " +userName);
        } else {
            System.out.println("Wrong login inforrmation");
        }
        }
}
