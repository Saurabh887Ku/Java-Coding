// WAJP to print alternate element of the array from end.

import java.util.Scanner;

public class AlternateElement {
    public static void alternateElement(int[] arr){
        for(int i=arr.length-1; i>=0; i-=2){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        alternateElement(arr);
    }
}
