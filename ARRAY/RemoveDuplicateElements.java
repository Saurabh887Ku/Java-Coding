// Remove all duplicates elements
import java.util.Scanner;
public class RemoveDuplicateElements{
    public static void removeDuplicateElements(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                System.out.println(arr[i]);
            }
        }
        // return arr;
    }

    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicateElements(arr);
    }
}