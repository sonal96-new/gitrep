//8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement

package java2;

import java.util.Scanner;

//A) While statement
public class Keyboard {

    public static void main(String[] args)
    {
        System.out.println("Enter the word");
        Scanner key=new Scanner(System.in);
        String word=key.next();
        while(!word.equals("done"))
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = key.next();

        }

    }
}
