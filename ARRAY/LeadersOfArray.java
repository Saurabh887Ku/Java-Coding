// FInd leaders of array element.
import java.util.Scanner;
public class LeadersOfArray{
    public static void arrayLeaders(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean flag = true;
            for(int j = i; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.print(arr[i]+" ");
            }
        }
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
        arrayLeaders(arr);
    }
}