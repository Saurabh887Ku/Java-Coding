// Divide an array into two sub array.
import java.util.Scanner;
public class DivideArray{
    public static void divideArrayInTwoSubarray(int[] arr){
        int length = arr.length;
        int first[] = new int[length / 2];
        int second[] = new int[length - first.length];
        for(int i=0; i<arr.length; i++){
            if(i < first.length){
                first[i] = arr[i];
            }
            else{
                second[i-first.length] = arr[i];
            }
        }
        for(int i : first){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : second){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        divideArrayInTwoSubarray(arr);
    }
}