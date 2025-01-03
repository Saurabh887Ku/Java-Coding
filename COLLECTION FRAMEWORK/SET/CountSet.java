import java.util.LinkedHashSet;
import java.util.Set;

public class CountSet {
    public static void main(String[] args) {
        int [] arr = new int[7];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 9;
        arr[5] = 9;
        arr[6] = 2;
        Set<Integer> set = new LinkedHashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set.size());
    }
}
