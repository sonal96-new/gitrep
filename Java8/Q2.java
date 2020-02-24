package Java8;
//Create a functional interface whose method takes 2 integers and return one integer.

import java.util.function.BiFunction;

class myClass2
 {
     public static void main(String[] args)
     {
         //BiFunction Interface takes 3 arguments
         BiFunction<String, String, String> concat = (a, b) -> a + b;
        //I had used Bifurcation apply() method
        System.out.println("Concatenation of two string = " + concat.apply("Hello", "World"));


     }
}
