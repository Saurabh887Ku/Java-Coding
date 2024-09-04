// Find different between largest and smallest element from the given array.
import java.util.Scanner;
public class DiffBwLarSmallest{
    public static int LargestAndSmallest(int[] arr){
        int largest = arr[0], smallest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            else{
                smallest = arr[i];
            }
        }
        System.out.println("Largest => "+largest);
        System.out.println("Smallest => "+smallest);

        return largest-smallest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Difference is => "+LargestAndSmallest(arr));
    }
}