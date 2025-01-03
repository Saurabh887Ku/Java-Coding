import java.util.Scanner;

public class InsertElementInArray {
    public static void insertElement(int[] arr, int pos){
        for(int i = arr.length-1; i>=pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = 12;
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position to be inserted");
        int pos = sc.nextInt();
        insertElement(arr,pos);
    }
}
