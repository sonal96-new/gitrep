
//Write a program which creates deadlock between 2 threads
package Multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account
{
    private int balance=10000;
    public void deposit(int amount)
    {
        balance += amount;
}
    public void withdraw(int amount)
    {
        balance -= amount;
    }
    public int getBalance()
    {
        return balance;
    }
    public static void transfer(Account acc1,Account acc2,int amount)
    {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
class Runner
{
    private Account acc1=new Account();
    private Account acc2=new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void first()throws InterruptedException
    {
        Random rm =new Random();
        for (int i=0;i<10000;i++)
        {
            lock1.lock();
            lock2.lock();
            try
            {
            Account.transfer(acc1,acc2,rm.nextInt(100));
            }
            finally
            {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    public void second()throws InterruptedException
    {
        Random rm =new Random();
        for (int i=0;i<10000;i++)
        {
            lock2.lock();
            lock1.lock();
            try
            {
            Account.transfer(acc2,acc1,rm.nextInt(100));
        }
            finally
            {
                lock1.unlock();
                lock2.unlock();
            }
        }

    }
    public void finished()
    {
        System.out.println("account 1 balance " + acc1.getBalance());
        System.out.println("account 2 balance " + acc2.getBalance());
        System.out.println("total balance " + (acc1.getBalance() + acc2.getBalance()));
    }
}
public class Q10
{
    public static void main(String[] args) throws InterruptedException{
        final Runner runner =new Runner();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    runner.first();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    runner.second();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        runner.finished();
    }
}
//OUTPUT:WITHOUT THE DEADLOCK CONDITION
//this output is shown when both the thread locks the account in the same order
/*
account 1 balance 4982
        account 2 balance 15018
        total balance 20000*/
//WHEN THE DEADLOCK OCCURS
//IT occurs when one thread tries to acquire the same resource which is locked by other thread at the same time.when we change the order of
//of lock in different threads then the deadlock condition occurs
//no output will be shown