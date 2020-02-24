package Java8;
/*Implement following functional interfaces from java.util.function using lambdas:
//1)Consumer Interface
2) Supplier
(3) Predicate
(4) Function*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class FuncInterface
{
    public static void main(String[] args) {
        //Consumer Interface(line no.:16-35)
        System.out.println("Consumer Interface :");
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 4 * list.get(i));
        };

        Consumer<List<Integer>>
                displayList = list -> list
                .stream()
                .forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println("The original list : " + list);
        modify.accept(list);
        System.out.println("The nodified list :");
        displayList.accept(list);

        //Supplier Interface
        System.out.println("\nSupplier interface :");
        Supplier<String> supplier = () -> "This is a supplier get method";
        System.out.println(supplier.get());

        //Predicate Interface
        System.out.println("Predicate Interface :");
        List<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> p = (s) -> s.equals(8);


        for (Integer t : names) {
            if (!p.test(t))
                System.out.print(t + " ");
        }
        System.out.println();

        //Function Interface
        System.out.println("Function Interface :");
        Function<Integer, Double> mul = a -> a * 2.0;
        mul = mul.andThen(a -> a + 50);

        System.out.println(mul.apply(10));
    }



}
