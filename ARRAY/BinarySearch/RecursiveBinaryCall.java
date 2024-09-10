// Searching an element in array by using binary search recusively
import java.util.Scanner;
public class RecursiveBinaryCall {
    public static int binarySearch(int[] arr, int low , int high, int value){
        int mid = (high+low)/2;
        if(arr[mid] == value){
            return mid;
        }
        else if(arr[mid] > value){
            return binarySearch(arr, low, high-1, value);
        }
        else if(arr[mid] < value){
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0, high = size-1,value;
        System.out.println("Enter value to be searched");
        value = sc.nextInt();
        System.out.println(binarySearch(arr, low, high, value));
    }
}
