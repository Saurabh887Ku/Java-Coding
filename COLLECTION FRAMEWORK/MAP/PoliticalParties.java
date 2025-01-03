import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PoliticalParties {
    public static void main(String[] args) {
        char[] party = {'A','B','C','D','E','F','G'};
        int[] seats = {90 ,150, 33, 23, 17, 500, 2};
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<party.length; i++){
            map.put(party[i],seats[i]);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int max = 0;
        for(char ch : list){
            int val = map.get(ch);
            System.out.println(ch+" "+val);
            max = Math.max(val,max);
        }
        System.out.println(max);
    }
}
