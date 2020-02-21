
//Write a program to demonstrate the use of semaphore
package Multithreading;

import java.util.concurrent.Semaphore;

class MyThread extends Thread {
     static int count = 0;
    Semaphore sem;
    String threadName;

    public MyThread(Semaphore sem, String threadName) {
        super(threadName);
        this.sem = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // run by thread A
        if (this.getName().equals("t1")) {
            System.out.println("Starting " + threadName);
            try {
                // First, get a permit.
                System.out.println(threadName + " is waiting for a permit.");
                sem.acquire();

                System.out.println(threadName + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for (int i = 0; i < 5; i=i+2) {
                    count++;
                    System.out.println(threadName + ": " + count);

                    // Now, allowing a context switch -- if possible.
                    // for thread B to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            sem.release();
        } else {
            System.out.println("Starting " + threadName);
            try {
                // First, get a permit.
                System.out.println(threadName + " is waiting for a permit.");

                // acquiring the lock
                sem.acquire();

                System.out.println(threadName + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for (int i = 0; i < 5; i=i+2) {
                    count--;
                    System.out.println(threadName + ": " + count);

                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            sem.release();
        }
    }
}

    public class Q8
    {
        public static void main(String args[]) throws InterruptedException
        {
            // creating a Semaphore object
            // with number of permits 1
            Semaphore sem = new Semaphore(1);

            // creating two threads with name A and B
            // Note that thread A will increment the count
            // and thread B will decrement the count
            MyThread mt1 = new MyThread(sem, "t1");
            MyThread mt2 = new MyThread(sem, "t2");

            // stating threads A and B
            mt1.start();
            mt2.start();

            // waiting for threads A and B
            mt1.join();
            mt2.join();

            // count will always remain 0 after
            // both threads will complete their execution
            System.out.println("count: " + MyThread.count);
        }
    }


