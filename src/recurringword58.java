
import java.util.ArrayList;
import java.util.Scanner;

public class recurringword58 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> userEntry = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = input.nextLine();
        userEntry.add(word);

        while (true) {
            System.out.println("Type a word: ");
            word = input.nextLine();
            if (userEntry.contains(word)) {
                break;
            } else {
                userEntry.add(word);
            }
        }
        System.out.println("You gave the word " + word + " twice");
    }
}
