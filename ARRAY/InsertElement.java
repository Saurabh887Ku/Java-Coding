import java.util.Scanner;
public class InsertElement{
    public static void insertElement(int[] arr, int size, int position){
        for(int i=size-1; i>=position; i--){
            arr[i] = arr[i-1];
        }
        arr[position-1] = 100;
        System.out.println("Inserted Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position ");
        int position = sc.nextInt();
        insertElement(arr,size,position);
    }
}