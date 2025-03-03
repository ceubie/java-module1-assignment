import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


/// Objective 2:
/// Write a program that takes a sentence as input and reverses the order of characters
/// in each word while maintaining the original order of words.
///
/// Requirements:
///
/// Prompt the user to input a sentence (a string with multiple words separated by spaces).
/// Use a StringBuilder to reverse each word individually.
/// Print the modified sentence with each word’s characters reversed, but the word order kept the same.

public class StringObjective {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();


        String[] splitSentence = sentence.split(" ");

        StringBuilder mod = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(String str : splitSentence){
            mod.append(str);
            mod.reverse();
            String x = mod.toString();
            list.add(x);
            mod.delete(0, mod.length());
        }
        String joined = String.join(" ", list);
        System.out.println(joined);
    }
}
