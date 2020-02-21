
//Write a program using synchronization method
package Multithreading;

class Even
{

    synchronized void printEven(int n)       //synchronized method
    {
        System.out.println("the thread id which is working "+ Thread.currentThread().getId());
        for(int i=1;i<=10;i=i+2){
            System.out.println(n + i);
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
class Block3 extends Thread
{
    Even e;
    Block3 (Even e)
    {
        this.e=e;


    }
    public void run(){
        e.printEven(5);
    }
}
class Block4 extends Thread
{
    Even e;
    Block4(Even e)
    {
        this.e=e;


    }
    public void run(){
        e.printEven(4);
    }
}
public class Q31
{
    public static void main(String[] args) {
        Even e=new Even();
        Block3 b3=new Block3(e);
        Block4 b4=new Block4(e);
        b3.start();
        b4.start();

    }



}
