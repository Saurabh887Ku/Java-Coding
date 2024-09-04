import java.util.Scanner;
public class MissingNumberInArray{
    public static void missingNumber(int[] arr){
        int sum = ((arr[arr.length-1]) * ((arr[arr.length-1]) + 1))/2;
        for(int i=0; i<arr.length; i++){
            sum -= arr[i];
        }
        System.out.println("Missing number is => "+sum);
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
        missingNumber(arr);
    }
}
