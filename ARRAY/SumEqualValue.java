// Pair of sum is equal to specific value in array.
import java.util.Scanner;
public class SumEqualValue{
    public static void pairSumEqualValue(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == value){
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter specific value");
        int value = sc.nextInt();
        pairSumEqualValue(arr,value);
    }
}