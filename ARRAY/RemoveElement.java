import java.util.Scanner;

public class RemoveElement {
    public static void removedElement(int[] arr, int element){
        int size = arr.length;
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i] == element){
                break;
            }
        }
        if(i<size){
            size = size - 1;
            for(int j=i; j<size; j++){
                arr[j] = arr[j+1];
            }
        }
        for(int j=0; j<size; j++){
            System.out.print(arr[j]+" ");
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
        System.out.println("Enter element to be deleted");
        int element = sc.nextInt();
        removedElement(arr,element);
    }
}
