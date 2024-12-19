import java.util.ArrayDeque;
import java.util.Deque;

public class MakeStackFromDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        while(!deque.isEmpty()){
            System.out.println(deque.poll());
        }
    }
}
