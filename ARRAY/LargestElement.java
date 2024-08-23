// Find largest element in the given array
import java.util.Scanner;
public class LargestElement {
    public static int largestElement(int arr[]){
        int largest=0;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        while(num-- > 0) {
            System.out.println("Enter size of array ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Largest element in array is : " + largestElement(arr));
        }
    }
}
