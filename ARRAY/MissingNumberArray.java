// Find missing number in array
import java.util.Scanner;
import java.util.Arrays;
public class MissingNumberArray{
    public static void missingNumberInArray(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr[i]+1; j<arr[i+1]; j++){
                System.out.print(j+" ");
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
        missingNumberInArray(arr);
    }
}