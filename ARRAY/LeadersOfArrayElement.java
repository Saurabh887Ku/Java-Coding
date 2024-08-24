// FInd leaders of array elements.
import java.util.Scanner;
public class LeadersOfArrayElement{
    public static void findLeadersArrayELement(int[] arr){
        int maxLeader = arr[arr.length - 1];
        System.out.print(maxLeader+" ");
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > maxLeader){
                maxLeader = arr[i];
                System.out.print(maxLeader+" ");
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
        findLeadersArrayELement(arr);
    }
}