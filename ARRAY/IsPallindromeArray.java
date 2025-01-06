import java.util.Scanner;

public class IsPallindromeArray {
    public static boolean isPalindromeArray(int[] arr){
        int start = 0,end = arr.length-1;
        while(start<=end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
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
        if(isPalindromeArray(arr)){
            System.out.println("Palindrome Array");
        }
        else{
            System.out.println("Not Palindrome Array");
        }
    }
}
