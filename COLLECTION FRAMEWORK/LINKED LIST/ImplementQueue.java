import java.util.LinkedList;
import java.util.Queue;
//  Create a program to implement a queue using LinkedList.

public class ImplementQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();// queue implemets linkedList
        queue.offer(1);
        queue.offer(2); 
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
