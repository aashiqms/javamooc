package com.company.aashiq;

import javax.swing.*;
import java.util.Scanner;

public class ex48firstCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any string ");
        String storeString = input.nextLine();
        System.out.println("enter the character location to be printed eg 0,1,2,3");
        int location = Integer.parseInt(input.nextLine());
        char character = storeString.charAt(location);
        System.out.println("the character is " +character);
    }
}
