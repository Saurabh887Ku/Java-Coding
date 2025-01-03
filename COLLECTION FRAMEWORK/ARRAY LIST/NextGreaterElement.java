import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(5);
        // 2 3 4 1 5 
        for(int i=0; i<list.size(); i++){
            int ng = -1;
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) < list.get(j)){
                    ng = list.get(j);
                    break;
                }
            }
            System.out.println(ng);
        }
    }
}
