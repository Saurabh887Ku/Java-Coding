import java.util.Scanner;
import java.util.Stack;
public class NextElementOfArray{
    public static void nextGreaterElement(int[]arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        int ng = -1;
        res[n-1] = ng;
        s.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(s.isEmpty() == false && s.peek() <= arr[i]){
                s.pop();
            }
            res[i] = (s.isEmpty() == false)?s.peek():-1;
            s.push(arr[i]);
        }
        for(int i : res){
            System.out.print(i+" ");
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
        nextGreaterElement(arr);
    }
}