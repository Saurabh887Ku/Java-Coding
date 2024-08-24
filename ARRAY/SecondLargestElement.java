// Find second largest element in given array.
import java.util.Scanner;
public class SecondLargestElement{
    public static int secondLargestElement(int[] arr){
        int firstLargest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstLargest){
                firstLargest = arr[i];
            }
        }
        int secondLargest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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
        System.out.println(secondLargestElement(arr));   
    }
}