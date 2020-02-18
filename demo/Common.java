//question number 5

package demo;

import java.util.HashSet;

public class Common {
    public static void main(String[] args) {
        String[] str = {"Kanpur","Delhi","Noida","Banglore","Pune"};
        String[] str1 = {"Delhi","Pune","Bhopal","Kanpur"};
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < str.length; i++)
        {
            for (int j = 0; j < str1.length; j++)
            {
                if(str[i].equals(str1[j]))
                {
                    set.add(str[i]);
                }
            }
        }

        System.out.println(set);
    }
}
