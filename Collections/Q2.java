
//Write a method that takes a string and returns the number of unique characters in the string.
package Collections;


import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public int unique(String s)
    {
        int val;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int count=0;
        char ch [] = s.toCharArray();
        for (char c : ch) {
            if(map.containsKey(c))
            {
                val = map.get(c);
                val = val + 1;
                map.put(c,val);
            }
            else
            {
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            int m = entry.getValue();
            if(m==1)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Q2 obj = new Q2();
        int c = obj.unique("hello");
        System.out.println("unique character count:"+c);

    }
}
