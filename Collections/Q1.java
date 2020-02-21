
//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
package Collections;

import java.util.*;

public class Q1
{
    static float SumFloat(List<Float> list)
    {
        float sum=0.0f;
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            float i = (float)itr.next();
            sum+=i;

        }
           return sum;

        }
    public static void main(String[] args) {
        List<Float> listF = new ArrayList<>();
        listF.add(4.0f);
        listF.add(3.0f);
        listF.add(5.0f);
        listF.add(7.0f);
        listF.add(2.0f);
        float result=SumFloat(listF);
        System.out.println("the sum of numbers :" + result);


    }
}
