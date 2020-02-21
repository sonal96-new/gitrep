
//Run a task with the help of callable and store it's result in the Future.

//Callable is a interface and a thread pool which contains call method to return the object of future
//the get() method used in future class waits for the callable to finish and then return the result to be used in future.
package Multithreading;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Q7
{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future=executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random rm=new Random();
                int duration=rm.nextInt(4000);
                if(duration > 2000)
                {
                    throw new IOException("The thread is sleeping too long");
                }
                System.out.println("the thread has started...!!");
                try
                {
                    Thread.sleep(duration);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("The thread has finishes..!!");
                return duration;
            }
        });
        executor.shutdown();
        try
        {
            System.out.println("The result is " + future.get());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
