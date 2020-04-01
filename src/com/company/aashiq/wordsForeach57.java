
import java.util.ArrayList;
import java.util.Scanner;

public class wordsForeach57 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> newUserEntry = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = input.nextLine();
        newUserEntry.add(word);

        while (true) {
            if (word.isEmpty()) {
                break;
            } else {
                System.out.println("Type a word: ");
                word = input.nextLine();
                newUserEntry.add(word);
            }
        }
        for (String toPrint : newUserEntry) {
            System.out.println(toPrint);
        }
    }
}
