import java.util.Scanner;
// For the given array of Strings, print the largest string and smallest string.

public class SmallAndLargeStrnig {
    public static void smallestAndLargestString(String[] arr){
        String smallest = "",largest = "";
        int min = arr[0].length(), max = arr[0].length();
        for(int i=0; i<arr.length; i++){
            if(min >= arr[i].length()){
                smallest = arr[i];
                min = arr[i].length();
            }
            else if(max <= arr[i].length()){
                largest = arr[i];
                max = arr[i].length();
            }
        }
        System.out.println("Smallest string is => "+smallest);
        System.out.println("Largest string is => "+largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        String[] arr = new String[size];
        sc.nextLine();
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextLine();
        }
        smallestAndLargestString(arr);
    }
}
