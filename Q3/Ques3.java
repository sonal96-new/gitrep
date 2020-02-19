
//3. WAP to produce NoClassDefFoundError .
package java2;

class New {

    void message()
    {
        System.out.println("Today is holiday!!");
    }
}

public class Ques3 {
    public static void main(String[] args) {
        New nw=new New();
        nw.message();
    }

}
/*
output:
        Exception in thread "main" java.lang.NoClassDefFoundError: java2/New
        at java2.Ques3.main(Ques3.java:15)
        Caused by: java.lang.ClassNotFoundException: java2.New
        at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:419)*/
