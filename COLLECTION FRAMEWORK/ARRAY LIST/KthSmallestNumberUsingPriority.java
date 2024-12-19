import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
// Find the Kth smallest number in a List using a PriorityQueue.
public class KthSmallestNumberUsingPriority {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(11);
        list.add(14);
        list.add(7);
        
        int k = 4;
        // Using Min-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 2 3 7 9 11 14
        for(int num : list){
            if(!pq.contains(num)){
                pq.offer(num);
            }
        }

        for(int i=1; i<k; i++){
            pq.poll();
        }
        
        System.out.println(pq.peek());

        // Using Max-Heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int num : list){
            //     pq.offer(num);
            //     if(pq.size() > k){
        //         pq.poll();
        //     }
        // }
        // System.out.println(pq.peek());
    }
}
