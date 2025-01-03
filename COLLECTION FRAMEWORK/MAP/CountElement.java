import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountElement{
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 2, 4}; // dekho is array ko map me add kiye hain thik hai 
        int[] arr2 = {3,2,2,7}; // aur is array ko add krne se pahle ye check kr rhe hai ki ye wala element pahle se map me present hai ya nhi agar pahle se present se present hai to uska frequency of element decrease kr do isilliye oo wala line 
        // map.put(i, map.getOrDefault(i, 0)-1); ye hai  thik hai samajh me aaya ya nhi 
        Map<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> common = new ArrayList<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1); // dekho us array ko is me add kiye hain thik hai 
        }
        for(int i : arr2){ // aur second array ko phir se add kr rhe h usi map me lekin check kr rhe hai ki kya oo key jo hai map me pahle se present hai ya nhi agar present hai to usko ek alag list me add kr do and usko map se uska value decrease kr do 
            if(map.containsKey(i) && map.get(i) > 0){
                common.add(i);
                map.put(i, map.getOrDefault(i, 0)-1); // decrease wala kaam yahan kr rhe hai jo element map me pahle se hi present hai taki us element ka dusra koi bhi element present na ho sake 
            }
        }
        // text kro ek baar 
        Collections.sort(common);
        System.out.println(common);
    }
}
