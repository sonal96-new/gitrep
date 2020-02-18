
//question number 8
package demo;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello world");
        System.out.println("The old string = " + s);

        System.out.println("The reverse string = " + s.reverse());
        System.out.println("The reversed string after replacing characters" +" "+ s.replace(4,10,""));

    }

}
