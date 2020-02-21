
//Write a program using synchronization block
//The second part of this question is in Q31
package Multithreading;

class Num
{

    void print(int n)
    {
        synchronized(this)          //synchronized block
        {
            System.out.println("the thread id which is working "+ Thread.currentThread().getId());
            for(int i=1;i<=10;i=i+2){
                System.out.println(n*i);
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println("Caught" + e);
                }
            }
        }
    }
}


class Block1 extends Thread
{
    Num t;
    Block1(Num t)
    {
        this.t=t;

    }
    public void run(){
        t.print(5);
    }

}
class Block2 extends Thread
{
    Num t;
    Block2 (Num t)
    {
        this.t=t;


    }
    public void run(){
        t.print(100);
    }
}


public class Q3{
    public static void main(String args[]){
      final   Num obj = new Num();      //only one object
        Block1 b1=new Block1(obj);
        Block2 b2=new Block2(obj);
        b1.start();
        b2.start();
    }
}

