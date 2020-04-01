package method;

import java.util.Scanner;
import java.util.stream.IntStream;

public class printUntil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of time to be printed");
        int times = Integer.parseInt(input.nextLine());
        printMany(times);


    }
    public static void printMany(int numbers){

        int i = 0;
        while (i < numbers){
            i++;
            System.out.println(i);
        }

    }
}
