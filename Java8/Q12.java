package Java8;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the first even number in the integer list which is greater than 3.
 class Q12
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,14,6,8,10,12,14,16,18,20);
       int num= list.stream()
                .filter(e->e>3)
                .filter(e->e%2==0)
                .findFirst().get();
        System.out.println("First even number greater than 3 :" + num);

    }
}
