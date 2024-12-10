// 1.	You are given an ArrayList arr of n items. You are also given an integer k. You need to find all the elements in arr that are smaller than k.
import java.util.ArrayList;
import java.util.Scanner;
// {8, 100, 20, 40, 3, 7} => k = 10
public class SmallerElementThanK {
    public static void smallerElement(ArrayList<Integer> arr, int k){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) < k){
                array.add(arr.get(i));
            }
        }
        System.out.println("All smallest element ");
        System.out.println(array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array list");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0; i<size; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println("Enter k value");
        int k = sc.nextInt();
        smallerElement(arr, k);
    }
}
