// Convert from array to arraylist.
import java.util.ArrayList;
import java.util.Scanner;
public class ConvertArrayToArrayList{
    public static void convertArrayList(int[] arr){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i:arr){
            array.add(i);
        }
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("\nAfter addng some elements");
        array.add(8);
        array.add(9);
        for(int i:array){
            System.out.print(i+" ");
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
        convertArrayList(arr);
    }
}