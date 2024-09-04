// Find duplicate value of string array.
import java.util.Scanner;
public class DuplicateStringValue{
    public static void findDuplicateStringValue(String[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextLine();
        }
        findDuplicateStringValue(arr);
    }
}