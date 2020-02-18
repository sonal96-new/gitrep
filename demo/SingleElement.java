
//question number 6
package demo;
import java.util.*;
public class SingleElement
{

        public static void Hashing(int [] a){
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i <a.length ; i++) {
                if(map.containsKey(a[i])) {
                    int count = map.get(a[i]);
                    map.put(a[i],++count);
                }else
                    map.put(a[i],1);
            }
            Set<Integer> set = map.keySet();
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                int key = iterator.next();
                if(map.get(key)==1){
                    System.out.println("Element appear only once in array - " + key);
                }
            }
        }

        public static void main(String[] args) {
            int [] a = { 1,5,6,2,1,6,4,3,2,5,3};
            Hashing(a);
        }
    }

