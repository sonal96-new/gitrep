//question number 3

package demo;
import java.util.Scanner;

public class CountMain {


    static int count;
       public static int Occurs(String s,char ch)
       {
           int l = s.length();
           int i=0;
           char c=s.charAt(i);
           if ( i==(l-1))
           {
               return 0;
           }
           else
               {
               if (c == ch)
               {
                   count++;
               }
               i++;
               Occurs(s.substring(i,l) , ch);


           }
           return count;
       }
           public static void main(String[] args) {
            int count=0;
            System.out.println("Enter the string");
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.println("Enter the character to be searched");
            char ch = sc.next().charAt(0);
            //char[] c = str.toCharArray();
            count= Occurs(str,ch);
            System.out.println("The character " + ch + " "+ "occurs "+ count + " "+ "times");
        }
    }

