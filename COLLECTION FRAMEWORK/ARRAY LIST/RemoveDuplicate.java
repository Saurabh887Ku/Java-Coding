import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        for(int i=0; i<list.size(); i++){
            int j;
            for(j = 0; j<i; j++){
                if(list.get(i) == list.get(j)){
                    break;
                }
            }
            if(i == j){
                System.out.println(list.get(i));
            }
        }
    }
}
