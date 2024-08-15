
import java.util.Scanner;
public class SunnyNumber {
    public static boolean isSunnyNumber(int num){
        int newNum=num+1;
        int sqrt=(int)Math.sqrt(newNum);
        int square=sqrt*sqrt;
        if(newNum == square){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a test case number");
        int testCase=sc.nextInt();
        int j=1;
        while(j++ <= testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isSunnyNumber(num)){
                System.out.println("Yes, Sunny Number");
            }
            else{
                System.out.println("Not, Sunny Number");
            }
        }
    }
}
