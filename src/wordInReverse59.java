import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 public class wordInReverse59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userEntry = new ArrayList<String>();
        System.out.println("enter the words ");
        String word = input.nextLine();
        userEntry.add(word);
        while(true) {
            if (word.isEmpty()) {
                break;
            }
            else {
                System.out.println("enter the words ");
                word = input.nextLine();
                userEntry.add(word);
            }
        }
         Collections.reverse(userEntry);
        for (String toPrint : userEntry) {
            System.out.println("the words in reverse are " +toPrint);

        }
    }
}

