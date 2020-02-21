
//Write a program to create a Thread pool of 2 threads where one Thread will print even numbers and other will print odd numbers.
package Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumThread implements Runnable {
    private int num;
    public NumThread(int n) {

            num = n;

    }
    public void run()
    {
        System.out.print(Thread.currentThread().getName() + " ");
        check(num);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
    private void check(int num)
    {
        if(num%2==0)
            System.out.println("even number " + num);
        else
            System.out.println("odd number " + num);
    }
}
public class Q4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);//creating a pool of 5 threads
        for (int i = 1; i < 10; i++) {
            Runnable number = new NumThread(i);
            if (i % 2 == 0) {
                executor.execute(number);//calling execute method of ExecutorService
            } else {
                executor.execute(number);
            }
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
