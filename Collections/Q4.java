
//Write a program to sort HashMap by value.
package Collections;

import java.util.*;
public class Q4
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map= new HashMap<String, Integer>();

        map.put("rohit", 101);
        map.put("sonal", 212);
        map.put("reena", 112);
        map.put("ritwik", 345);
        map.put("jaya", 897);


        System.out.println("HashMap before sorting, random order ");
        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        for(Map.Entry<String, Integer> entry : entries)
        {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(entries);

        // sorting HashMap by values using comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >()
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            sortedByValue.put(aa.getKey(), aa.getValue());
        }
        System.out.println("HashMap after sorting entries by values ");
        Set<Map.Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();

        for(Map.Entry<String, Integer> mapping : entrySetSortedByValue){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }
}
