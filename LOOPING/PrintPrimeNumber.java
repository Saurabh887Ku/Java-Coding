
import java.util.Scanner;
public class PrintPrimeNumber {
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int start, int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting point ");
        int start=sc.nextInt();
        System.out.println("Enter the ending point");
        int end=sc.nextInt();
        printPrime(start,end);
    }
}
