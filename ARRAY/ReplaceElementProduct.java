// Replace all the array elements with all the product of array elements.
import java.util.Scanner;
public class ReplaceElementProduct{
    public static int[] productOfArrayElement(int[] arr){
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = product-arr[i];
        }
        return arr;
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        arr = productOfArrayElement(arr);
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
