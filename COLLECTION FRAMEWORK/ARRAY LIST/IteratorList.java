import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2); // 2
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int n = itr.next(); // 1
            if(n % 2 == 1){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
