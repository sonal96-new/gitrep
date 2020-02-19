
//Q13. Create a custom exception that do not have any stack trace.
package java2;

import java.util.Scanner;

class InvalidAgeException extends Exception
        {
    public InvalidAgeException(String s)
    {
        super(s);
    }
}


public class CustomException {
    public static void main(String args[])
    {
        int age;
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        try {
            if (age < 18) {
                // Throw an object of user defined exception
                throw new InvalidAgeException("he is not eligble for vote");
            } else {
                System.out.println("he is eligble for vote");
            }
        }
        catch (InvalidAgeException  ex)
        {
            System.out.println("The age should be greater than 18");
            System.out.println(ex.getMessage());

        }
    }
}
