
//Write a program to demonstrate wait and notify methods.
package Multithreading;

import java.util.Scanner;

class Process
{
    public void producer()throws InterruptedException
    {
synchronized (this)
{
    System.out.println("producer produces the item in the queue");
    wait();
    System.out.println("continue the process after consumer has consumed the item");
}
    }
    public void consumer()throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Thread.sleep(1000);
        synchronized (this)
        {
            System.out.println("consumer consumes the item from the queue");
            System.out.println("waiting for return key..");
            sc.nextLine();
            System.out.println("return key is pressed");
            notify();
            Thread.sleep(200);

        }
    }
}
public class Q5
{
    public static void main(String[] args)throws InterruptedException {
        final Process proc = new Process();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.producer();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.consumer();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        t2.start();
    }

}
