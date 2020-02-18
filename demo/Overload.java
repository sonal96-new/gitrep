
//question number 10
package demo;

public class Overload {
    public  void sum(int a,int b)
    {
        System.out.println("The sum of two number is :"+ (a+b));
    }
    public  void sum(double a,double b)
    {
        System.out.println("The sum of two  double number is :"+ (a+b));
    }
    public  void mul(float a,float b)
    {
        System.out.println("The multiplication of two  floating number is :"+ a*b);
    }
    public  void mul(int a,int b)
    {
        System.out.println("The multiplication of two  integer number is :"+ a*b);
    }
    public  void con(String a,String b)
    {
        System.out.println("The concatenation  of two strings is :"+ a + b);
    }
    public  void con(String a,String b,String c)
    {
        System.out.println("The concatenation of three strings is :"+ a + b + c);
    }

    public static void main(String[] args)
    {
     Overload ob=new Overload();
     ob.sum(10,5);
        ob.sum(10.5,12.0);
        ob.mul(13,5);
        ob.mul(10.2f,5.2f);
        ob.con("10","5");
        ob.con("sonal","gupta","96");

    }
}
