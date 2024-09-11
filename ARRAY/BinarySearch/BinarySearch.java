

import java.util.Scanner;
public class BinarySearch{
    public static int binarySearch(int[] arr, int value){
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = (high+low)/2;
            if(arr[mid] == value){
                return mid;
            }
            else if(arr[mid] > value){
                high = mid-1;
            }
            else if(arr[mid] < value){
                low = mid+1;
            }
        }
        return -1;
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
        System.out.println("Enter value to be searched");
        int value = sc.nextInt();
        System.out.println(binarySearch(arr, value));
    }
}
