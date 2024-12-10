// 2.	Given an integer ArrayList arr[]. The task is to find the maximum for every adjacent pairs in the ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumOfTwoElement {
    public static void maximumAdjacentPair(ArrayList<Integer> arr){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<arr.size()-1; i++){
            array.add(Math.max(arr.get(i),arr.get(i+1)));
        }
        System.out.println(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the arraylist");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        maximumAdjacentPair(arr);
    }
}
