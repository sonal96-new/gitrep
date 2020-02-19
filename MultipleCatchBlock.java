
//6. WAP showing try, multi-catch and finally blocks.
package java2;

public class MultipleCatchBlock {
    public static void main(String[] args)
    {

        try
        {
            int array[]=new int[10];
            array[5]=30/0;
            System.out.println(array[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("finally block is always executed");

    }
}
}
