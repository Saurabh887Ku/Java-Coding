import java.util.Scanner;
import java.util.Stack;

public class MinimumElementinStack {
    public static void minimumElement(int[] arr, int size){
        Stack<Integer> s = new Stack<>();
        for(int i:arr){
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                s.push(Math.min(i,s.peek()));
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        minimumElement(arr, size);
    }
}
