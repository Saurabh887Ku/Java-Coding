//  Find the smallest elements of the given array.
import java.util.Scanner;
public class SmallestElement{
    public static int smallestElementOfArray(int [] arr){
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest element of array is -> "+smallestElementOfArray(arr));
    }
}