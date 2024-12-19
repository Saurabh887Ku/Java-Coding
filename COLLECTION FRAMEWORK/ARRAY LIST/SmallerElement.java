import java.util.ArrayList;
import java.util.Iterator;

public class SmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(7);
        list.add(25);
        list.add(50);
        list.add(14);
        int k = 20;
        // for(int i : list){
        //     if(i <= k){
        //         System.out.print(i+" ");
        //     }
        // }
        
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int i = itr.next();
            if( i <= k){
                System.out.print(i+" ");
            }
        }
    }
}
