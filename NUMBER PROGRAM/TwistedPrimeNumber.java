
import java.util.Scanner;
public class TwistedPrimeNumber {
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isTwistedPrimeNumber(int num){
        int reverse=0;
        while(num > 0){
            int mod=num % 10;
            reverse = reverse*10+mod;
            num /= 10;
        }
        if(isPrime(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isTwistedPrimeNumber(num)){
            System.out.println("Yes, Twisted Prime Number");
        }
        else{
            System.out.println("Not, Twisted Prime Number");
        }
    }
}
