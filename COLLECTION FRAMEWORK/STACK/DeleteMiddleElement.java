import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElement {
    public static void deleteMiddleElement(Stack<Integer> stack, int size){
        Stack<Integer> s = new Stack<>();
        int mid = size / 2;
        while(mid != 0){
            s.push(stack.pop());
            mid--;
        }
        stack.pop();
        while(!s.isEmpty()){
            stack.push(s.pop());
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the stack");
        int size = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter elements");
        for(int i=0; i<size; i++){
            int x = sc.nextInt();
            stack.push(x);
        }
        deleteMiddleElement(stack, size);
    }
}
