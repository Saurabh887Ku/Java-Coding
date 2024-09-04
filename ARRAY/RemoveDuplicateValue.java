// Remove duplicate elements from array
import java.util.Scanner;
public class RemoveDuplicateValue{
    public static void removeDuplicate(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(j == i){
                System.out.println(arr[i]);
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
        removeDuplicate(arr);
    }
}