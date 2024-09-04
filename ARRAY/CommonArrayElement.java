// Find common element in two array.
import java.util.Scanner;
public class CommonArrayElement{
    public static void commonElementInArray(int[] arr, int[] array){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<array.length; j++){
                if(arr[i] == array[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter first array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int[] array = new int[size];
        System.out.println("Enter second array element");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        commonElementInArray(arr, array);
    }
}