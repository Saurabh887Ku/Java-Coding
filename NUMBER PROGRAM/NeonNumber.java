
import java.util.Scanner;
public class NeonNumber {
    public static boolean isNeonNumber(int num){
        int sum=0,temp=num,sqrt=num*num;
        while(sqrt > 0){
            int mod=sqrt % 10;
            sum += mod;
            sqrt /= 10;
        }
        if(temp == sum){
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
        if(isNeonNumber(num)){
            System.out.println("Yes, Neon Number");
        }
        else{
            System.out.println("Not, Neon Number");
        }
    }
}
