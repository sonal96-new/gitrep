package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Collect all the even numbers from an integer list.
 class Q9
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);
        System.out.println("Even numbers present in the list are : ");
        System.out.println(
        list.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
        );

    }
}
