
//1. Write a program do to demonstrate the use of volatile keyword.
package Multithreading;
public class Q1 {
    private static  volatile int i = 0;

    public static void main(String[] args) {
        new Test().start();
        new Test1().start();
    }
    static class Test extends Thread
    {

        @Override
        public void run()
        {
            int var=i;
            while(var<5)
            {
                if(var!=i)
                {
                    System.out.println("change value of i" + i);
                }
                var=i;
            }
        }
    }
    static class Test1 extends Thread
    {
        @Override
        public void run()
        {
            int var = i;
            while(i<5)
            {
                System.out.println("increamenting value of i "+ (var+1));
                i = ++var;
                System.out.println(i);
                System.out.println(var);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }

            }
        }
    }
}

//OUTPUT:
//without using the volatile keyword
/*incrementing value of i 1
        1
        1
        change value of i1
        incrementing value of i 2
        2
        2
        incrementing value of i 3
        3
        3
        incrementing value of i 4
        4
        4
        incrementing value of i 5
        5
        5*/


//with using volatile keyword
/*incrementing value of i 1
        1
        1
        change value of i1
        incrementing value of i 2
        2
        2
        change value of i2
        incrementing value of i 3
        3
        3
        change value of i3
        incrementing value of i 4
        4
        4
        incrementing value of i 5
        5
        5*/




