import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountFrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "ankita patel singh";
        
        Map<Character,Integer> map = new TreeMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(m.getKey() != ' '){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
        // Using Set 
        // Set<Character> set = new HashSet<>();
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     set.add(ch);
        // }
        // for(char ch : set){
        //     int count = 0;
        //     for(int i=0; i<str.length(); i++){
        //         if(ch == str.charAt(i)){
        //             count++;
        //         }
        //     }
        //     System.out.println(ch +" " + count);
        // }
        
    }
}
