
import java.util.Scanner;
public class KaprekarNumber {
    public static boolean isKaprekarNumber(int num){
        int res=num,sum=0,count=0;
        while(num > 0){
            count++;
            num /= 10;
        }
        int square=res*res;
        int power=(int)Math.pow(10,count);
        int first=square % power;
        int second=square / power;
        sum = first+second;
        if(sum == res){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int testCase=sc.nextInt();
        int j = 1;
        while(j++ <= testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isKaprekarNumber(num)){
                System.out.println("Yes, Kaprekar Number");
            }
            else{
                System.out.println("Not, Kaprekar Number");
            }
        }
    }
}
