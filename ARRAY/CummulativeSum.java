// Program to find cummulative sum of array elements.
import java.util.Scanner;
public class CummulativeSum{
    public static void cummulativeArraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
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
        cummulativeArraySum(arr);
    }
}