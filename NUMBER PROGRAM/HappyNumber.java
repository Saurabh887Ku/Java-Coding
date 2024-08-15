
import java.util.Scanner;
public class HappyNumber {

    public static int HappyNumber(int num){
        int sum=0;
        while(num > 0){
            int mod=num % 10;
            int sqrt=mod*mod;
            sum+=sqrt;
            num/=10;
        }
        return sum;
    }
    public static boolean isHappyNumber(int num){
        int result=num;
        while(result != 1 && result != 4){
            result=HappyNumber(result);
        }
        if(result==1){
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
        if(isHappyNumber(num)){
            System.out.println("Yes, Happy Number");
        }
        else{
            System.out.println("Not, Happy Number");
        }
    }
}
