import java.util.PriorityQueue;
import java.util.Stack;

public class RemoveMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("Stack data =>");
        while(!s.isEmpty()){
            pq.offer(s.pop());
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
        System.out.println("Priority queue data =>");
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
        // while(!s.isEmpty()){
        //     System.out.print(s.pop()+" ");
        // }
        // int middle = s.size() / 2; // 2 1 

        // Stack<Integer> st = new Stack<>();
        // while(middle > 0){
        //     st.push(s.pop());
        //     middle--;
        // }
        // s.pop(); // remove middle element
        // while(!st.isEmpty()){
        //     s.push(st.pop());
        // }
        // while(!s.isEmpty()){
        //     System.out.print(s.pop()+" ");
        // }
    }
}
