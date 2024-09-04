// Program to check array contains a specific value or not.
import java.util.Scanner;
public class ContainsSpecificValue{
    public static String isContains(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return "Yes, value exists in array";
            }
        }
        return "Not, value does not exists in array";
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
        System.out.println("Enter search value");
        int value = sc.nextInt();
        System.out.println(isContains(arr, value));
    }
}