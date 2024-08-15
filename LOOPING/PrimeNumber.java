
import java.util.Scanner;
public class PrimeNumber{
    public static boolean isPrime(int num){
        /* 1 way
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        // 2 way
        int count=0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else {
            return false;
        }
        // 3way
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        */
        // 4 way
        if(num==1 || num == 0){
            return false;
        }
        else if(num == 2 || num == 3){
            return true;
        }
        else if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for(int i=5; i*i<=num; i+=6){
            if(num % i == 0 || num % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

