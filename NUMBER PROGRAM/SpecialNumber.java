
import java.util.Scanner;
public class SpecialNumber {
    public static long factorialNumber(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean isSpecialNumber(int num){
        int sum = 0, result = num;
        while(num > 0){
            int mod = num % 10;
            long fact = factorialNumber(mod);
            sum += fact;
            num /= 10;
        }
        if(result == sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case number");
        byte testCase=sc.nextByte();
        int i=1;
        while(i <= testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isSpecialNumber(num)){
                System.out.println("Yes, Special Number");
            }
            else{
                System.out.println("Not, Special Number");
            }
            i++;
        }
    }
}
