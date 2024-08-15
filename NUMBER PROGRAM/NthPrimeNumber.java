
import java.util.Scanner;
public class NthPrimeNumber {
    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int primeNumber(int num){
        int count=0,prime=0;
        for(int i=1; i<=1000; i++){
            if(isPrime(i) && count <= num){
                count++;
                prime=i;
            }
            else if(count > num){
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(primeNumber(num));
    }
}
