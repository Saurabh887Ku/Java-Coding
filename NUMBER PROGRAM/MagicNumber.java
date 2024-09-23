// Check the given number is magic number or not
import java.util.Scanner;
public class MagicNumber {
    public static int magicNumber(int num){
        int sum = 0;
        while(num > 0){
            int mod = num % 10;
            sum += mod;
            num /= 10;
        }
        return sum;
    }

    public static boolean isMagicNumber(int num){
        while(num != 1 && num > 9){
            num=magicNumber(num);
        }
        if(num == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case number");
        byte testCase=sc.nextByte();
        int j=1;
        while(j++ <= testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isMagicNumber(num)){
                System.out.println("Yes, Magic Number");
            }
            else{
                System.out.println("Not, Magic Number");
            }
        }
    }
}
