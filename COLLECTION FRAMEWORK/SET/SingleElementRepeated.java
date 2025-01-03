import java.util.LinkedHashSet;
import java.util.Set;

public class SingleElementRepeated {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 3;
        arr[4] = 4;
        Set<Integer> set = new LinkedHashSet<>();
        int repeated = -1;
        for(int i : arr){
            if(set.contains(i)){
                repeated = i;
                break;
            }
            set.add(i);
        }
        int count = 0;
        for(int i : arr){
            if(i == repeated){
                count++;
            }
        }
        System.out.println(repeated+" "+count);
    }
}
