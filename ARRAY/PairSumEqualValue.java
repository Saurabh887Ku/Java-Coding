// 52. Java Program to Find All Pairs of Elements in an Array Whose Sum is Equal to a Specified Number	
import java.util.Scanner;
public class PairSumEqualValue{
    public static void pairSumEqualValues(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == value){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum value");
        int value = sc.nextInt();
        pairSumEqualValues(arr, value);
    }
}