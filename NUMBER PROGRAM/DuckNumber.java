
import java.util.Scanner;
public class DuckNumber {
    public static boolean isDuckNumber(int num){
        int countZero=0;
        while(num > 0){
            int mod=num%10;
            if(mod == 0){
                return true;
            }
            num/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(isDuckNumber(num)){
            System.out.println("Yes, Duck Number");
        }
        else{
            System.out.println("Not, Duck Number");
        }
    }
}
