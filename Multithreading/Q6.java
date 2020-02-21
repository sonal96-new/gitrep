
//Write a program to demonstrate sleep and join methods.
package Multithreading;
class Sleep extends Thread
{
    static int connection=0;
    public void run()
    {
        System.out.println("the id of current thread " + Thread.currentThread().getId());
        for(int i=0;i<5;i++)
        {
connection++;
            System.out.println("the value of connect " + connection);

        }
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
public class Q6
{
    public static void main(String[] args)throws InterruptedException{
        Sleep sp=new Sleep();
        Sleep sp1=new Sleep();
        sp.start();
        sp1.start();
        sp.join();
        sp1.join();
        System.out.println("the value  " + Sleep.connection);

    }
}
