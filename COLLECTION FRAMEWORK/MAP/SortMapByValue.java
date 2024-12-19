import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Mango");
        hashMap.put(5,"banana");
        hashMap.put(4,"Apple");
        hashMap.put(2,"pineapple");
        hashMap.put(3,"orange");

        List<Map.Entry<Integer,String>>list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Integer,String> sorted = new LinkedHashMap<>();
        
        for(Map.Entry<Integer,String> mp : list){
            sorted.put(mp.getKey(),mp.getValue());
        }
        for(Map.Entry<Integer,String> data : sorted.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }
    }
}
