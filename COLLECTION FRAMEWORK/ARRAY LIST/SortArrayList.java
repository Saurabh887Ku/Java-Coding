import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortArrayList {
    public static void main(String[] args) {
        String str = "aa bbb ccc ankita patel";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
