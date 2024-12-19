import java.util.ArrayList;

public class RemovePersonInCircle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<7; i++){
            list.add(i);
        }
         
        int k = 2; 
        int index = 0;
        while(list.size() > 1){
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        System.out.println(list.get(0));
    }
}
