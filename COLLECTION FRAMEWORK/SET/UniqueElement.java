import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Set<Integer> unique = new LinkedHashSet<>(); // 1 2 3 4 5 6 7
        Set<Integer> repeated = new LinkedHashSet<>(); // 1 2 3
        for(int i : list){
            if(unique.contains(i)){
                repeated.add(i);
            }
            else if(!repeated.contains(i)){
                unique.add(i);
            }
        }
        
        for(int i : list){
            if(unique.contains(i) && !repeated.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
