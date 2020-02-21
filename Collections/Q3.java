
//Write a method that takes a string and print the number of occurrence of each character characters in the string.
package Collections;

import java.util.HashMap;

public class Q3
{
    static void counter(String s)
    {
        int count;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        char ch []=s.toCharArray();
        for (char c : ch)
        {
            if(map.containsKey(c))
            {
                count=map.get(c);
                count=count +1;
                map.put(c,count);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args)
    {
        String s="grandfather";
        counter(s);
    }
}
