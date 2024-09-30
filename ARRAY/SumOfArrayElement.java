import java.util.Scanner;
public class SumOfArrayElement{
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimeNumber(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(isPrime(arr[i])){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter array element");
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of prime numbers in array is : "+sumOfPrimeNumber(arr));
    }
}