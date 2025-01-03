import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinimumValueInArrayLilst {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        Stack<Integer> s = new Stack<>();
        for(int i : list){
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                s.push(Math.min(i,s.peek()));
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }   
}
