import java.util.Scanner;
// WAJP to print each element of the array which has appeared only once in the array.

public class UniqueElementArray {
    public static void uniqueArrayElement(int[]arr){
        int[] freq = new int[arr.length];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = -1;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = 1;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(freq[i] == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        uniqueArrayElement(arr);
    }
}
