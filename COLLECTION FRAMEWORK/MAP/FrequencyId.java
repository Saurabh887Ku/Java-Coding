import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyId {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,5,6};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
