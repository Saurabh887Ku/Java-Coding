import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        int index = stack.size() / 2; // 5 / 2 = 2
        Stack<Integer> s = new Stack<>();
        while(index > 0){
            s.push(stack.pop());
            index--;
        }
        stack.pop();
        while(!stack.isEmpty()){
            // stack.push(s.pop());
            s.push(stack.pop());
        }
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
