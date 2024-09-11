// Check the given number is prime or not using another hard method
import java.util.Scanner;
public class PrimeNumberCheck{
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else if(num == 2 || num == 3){
            return true;
        }
        else if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for(int i=5; i<=num/2; i+=6){
            if(num % i == 0 || num % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Yes, Prime Number");
        }
        else{
            System.out.println("Not, Prime Number");
        }
    }
}