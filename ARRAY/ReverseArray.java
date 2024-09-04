import java.util.*;
public class ReverseArray {
    public static void printReverseArray(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i : arr){
            s.push(i);
        }
        while(!s.empty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        printReverseArray(arr);
    }
}
