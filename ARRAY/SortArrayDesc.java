// Sort the given array elements in descending order.
import java.util.Scanner;
public class SortArrayDesc{
    public static int[] sortArrayDescending(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i=-1;
            }
        }
        return arr;
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        arr = sortArrayDescending(arr);
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}