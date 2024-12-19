import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasPrevious()){
            int i = itr.previous();
            System.out.println(i);
        }
    }
}
