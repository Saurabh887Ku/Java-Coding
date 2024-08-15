import java.util.Scanner;
public class SumOfElement {
    
    public static void sumOfElement(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of elements are : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        sumOfElement(arr);
    }
}
/*

 */
