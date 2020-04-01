package com.company.aashiq;

public class printingStars {
    public static void main(String[] args) {
        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printStars(9);
        System.out.println();
        printsquare(4);
        System.out.println();
        printrectrangle(10, 3);
        printlefttriangle(4);
        printWhite(1);
    }
        private static void printStars ( int amount) {
            for (int a = 1; a <= amount; a++) {
                System.out.print("*");
            }
        }
        private static void printsquare ( int sidesize) {
            printStars(sidesize);
            System.out.println();
            printStars(sidesize);
            System.out.println();
            printStars(sidesize);
            System.out.println();
            printStars(sidesize);
            System.out.println();

        }
        private static void printrectrangle(int width, int height) {
            for (int a = 1 ; a<=height ; a++) {
                System.out.println();
                printStars(width);
                System.out.println();
            }
        }
    public static void printWhite(int size){
        int i = size;
        for(int j = 0; j<i; j++){
            System.out.print(" ");
        }
    }

        private static void printlefttriangle(int size) {
            int i = size;
            int j = 1;
            while(j<=i){
              // printWhite(i-j);
                printStars(j);
                j++;
                System.out.println("");
            }
        }

        }

