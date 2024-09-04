// Convert from arraylist to array.
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ConvertArrayListToArray{
    public static void arrayListToArray(ArrayList<Integer> arr, int size){
        int[] array = new int[size];
        for(int i=0; i<arr.size(); i++){
            array[i] = arr.get(i);
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            int ele = sc.nextInt();
            arr.add(ele);
        }
        arrayListToArray(arr,size);
    }
}