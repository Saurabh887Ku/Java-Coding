/* WAJP to rotate all the elements of array k position to its left.
 array[] = {1,2,3,4,5,6,7} ,                       
 k=2 
 Output: {6 7 1 2 3 4 5} */

import java.util.Arrays;

public class RotateArrayByKValue {
    public static void rotateArrayByK(int[] arr, int k){
        int track = 1; // k = 2
        while(track <= k){
            int last = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            track++;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotateArrayByK(arr, k);
    }
}
