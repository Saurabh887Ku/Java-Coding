import java.util.Scanner;
public class SumOfEvenOdd{
    public static void sumOfEvenOdd(int[] arr){
        int evenSum = 0, oddSum = 0;
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sumOfEvenOdd(arr);
    }
}
