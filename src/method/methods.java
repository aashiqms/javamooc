package method;
import java.util.Scanner;
import java.util.stream.IntStream;


public class methods {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("how many times to print");
        int times = Integer.parseInt(input.nextLine());
            IntStream.range(0, times).forEach(i -> printText());
    printText();
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method \n " );
    }
}



