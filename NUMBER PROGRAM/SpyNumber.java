
import java.util.Scanner;
public class SpyNumber {
    public static boolean isSpyNumber(int num){
        int sum=0,prod=1;
        while(num > 0){
            int mod = num % 10;
            sum += mod;
            prod *= mod;
            num /= 10;
        }
        if(sum == prod){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case number");
        int testCase=sc.nextInt();
        int i=1;
        while(i<=testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isSpyNumber(num)){
                System.out.println("Yes, Spy Number");
            }
            else{
                System.out.println("Not, Spy Number");
            }
            i++;
        }
    }
}
