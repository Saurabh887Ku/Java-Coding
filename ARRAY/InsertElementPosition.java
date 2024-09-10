import java.util.Scanner;
public class InsertElementPosition{
    public static void insertElement(int[] arr, int pos, int value){
        for(int i=arr.length-1; i>=pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = value;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Position to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter value to be inserted");
        int value = sc.nextInt();
        insertElement(arr,pos,value);
    }
}