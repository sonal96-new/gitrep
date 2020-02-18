
//question number 7
package demo;

public class Print {
    static String Firstname,Lastname;
    static int age;
    static{
        Firstname="Sonal";
        Lastname="Gupta";
        age = 22;
    }
    static void PrintMethod()
    {
        System.out.println("The Full name is :" + Firstname + " "+ Lastname);
        System.out.println("my Age is :" + age);

    }

    public static void main(String[] args) {

        PrintMethod();
    }
}
