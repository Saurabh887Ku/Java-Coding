import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirst {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        int k = 3;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<k; i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        for(int i=0; i<q.size()-k; i++){
            q.offer(q.poll());
        }
        System.out.print(q);
    }
}
