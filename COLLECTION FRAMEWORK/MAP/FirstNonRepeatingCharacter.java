import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ankita";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                System.out.println(m.getKey());
                break;
            }
        }
    }
}
