import java.util.Scanner;
import java.util.Vector;
import java.util.Stack;
public class MinimumElement{
    public static void minimumElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        for(int i : arr){
            s.push(i); // 1 6 43 2 0 5 6
            if(minStack.isEmpty() || i <= minStack.peek()){
                minStack.push(i);
            }
        }
        while(!s.isEmpty()){
            System.out.println(minStack.peek());
            int a = s.pop();
            if(a == minStack.peek()){
                minStack.pop();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        minimumElement(arr);
    }
}