//ques 8
//b)do-while statement
package java2;

import java.util.Scanner;

public class Keyboard1 {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = key.next();
        do {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = key.next();
        }
        while (!word.equals("done"));
    }
}
