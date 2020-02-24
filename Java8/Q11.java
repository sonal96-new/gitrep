package Java8;

import java.util.Arrays;
import java.util.List;

//Find average of the number inside integer list after doubling it.
class Q11
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        double average=
                list.stream()
                        .map(e->e*2)
                        .mapToInt(e->e).average().orElse(Double.NaN);
        System.out.println("the average of the numbers : " + average);

    }
}
