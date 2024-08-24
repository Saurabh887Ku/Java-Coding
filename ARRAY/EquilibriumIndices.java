import java.util.Scanner;
public class EquilibriumIndices{
    public static void equilibriumIndex(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        int current = 0;
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            if (sum - current - n == current) {
                System.out.print(i+" ");
            }
            current+=n;
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
        equilibriumIndex(arr);
    }
}