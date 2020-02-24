package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sum all the numbers greater than 5 in the integer list.
 class Q10
 {
     public static void main(String[] args)
     {
         List<Integer> list = Arrays.asList(15,35,20,85,90,4,2,1);
         int sum=
                 list.stream()
                         .filter(e->e>5)
                         .mapToInt(e->e).sum();
         System.out.println("the sum of the numbers : " + sum);

     }
}
