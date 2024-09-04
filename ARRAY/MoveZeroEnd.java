// Java Program to Move All the 0’s (zero elements) to the End of the Array.
import java.util.Scanner;
public class MoveZeroEnd{
    public static void moveZeroAtEnd(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            if(arr[start] != 0){
                start++;
            }
            else if(arr[end] == 0){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        moveZeroAtEnd(arr);
    }
}