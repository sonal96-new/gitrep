
//2. Write a program to create a thread using Thread class and Runnable interface each.
package Multithreading;

class Multi extends Thread
{
    public void run()
    {
        System.out.println("the id of current thread " + Thread.currentThread().getId());
        for(int i=0;i<5;i++)
        {
            System.out.println("the value of i " + i);
        }
    }

    }
class Multi1 implements Runnable{
    public void run(){
        System.out.println("the id of current thread " + Thread.currentThread().getId());
        for(int i=0;i<5;i++)
        {
            System.out.println("the value of i " + i);
        }
    }
    }
    public class Q2
    {
    public static void main(String[] args)
    {
            Multi t1=new Multi();
            t1.start();
            Multi t2=new Multi();
            t2.start();
            Multi1 ob=new Multi1();
            Thread m1 =new Thread(ob);
            m1.start();
            Thread m2 =new Thread(ob);
            m2.start();
        }
}
