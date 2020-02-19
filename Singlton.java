
//4. WAP to create singleton class.
package java2;

 class Single {
    private static Single instance =null;

    public String s;

    private Single()
    {
        s = "Hello Everyone! you all are invited to my birthday party";
    }

    public static Single getInstance()
    {
        if (instance == null)
            instance = new Single();

        return instance;
    }
}


public class Singlton
{
    public static void main(String args[])
    {

        Single x = Single.getInstance();
        Single y = Single.getInstance();
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");


        y.s = (y.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);

    }
}
