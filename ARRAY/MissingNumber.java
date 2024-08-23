// Find missing number in array element
import java.util.Scanner;
public class MissingNumber {

    public static int missingNumber(int[] arr){
        int length=arr.length;
        int naturalSum=length*(length+1)/2;
        for(int i=0; i<arr.length; i++){
            naturalSum-=arr[i];
        }
        return naturalSum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Missing Number is : "+missingNumber(arr));
    }
}
