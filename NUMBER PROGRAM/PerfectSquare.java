
import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num){
        int sqrt=(int)Math.sqrt(num);
        int square=sqrt*sqrt;
        if(num == square){
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
            if(isPerfectSquare(num)){
                System.out.println("Yes, Perfect Square");
            }
            else{
                System.out.println("Not, Perfect Square");
            }
        }
    }
}
