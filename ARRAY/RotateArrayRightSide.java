import java.util.Scanner;

public class RotateArrayRightSide {
    public static void rotateArrayElement(int[] arr){
        int p=1;
        while(p<=2){
            int first = arr[0];
            for(int i=1; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = first;
            p++;
        }
        
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        rotateArrayElement(arr);
    }
}
