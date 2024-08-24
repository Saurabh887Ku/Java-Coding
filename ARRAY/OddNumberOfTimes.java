// Find the odd number of times occuring elements in array.
import java.util.Scanner;
public class OddNumberOfTimes{
    public static int oddNumberOfTimeOccuring(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oddNumberOfTimeOccuring(arr));
    }
}