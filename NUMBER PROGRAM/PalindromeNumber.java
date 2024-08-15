
import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPalindromeNumber(int num){
        int res=num,rev=0;
        while(num > 0){
            int mod = num % 10;
            rev = rev * 10 + mod;
            num /= 10;
        }
        if(res == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isPalindromeNumber(num)){
            System.out.println("Yes, Palindrome Number");
        }
        else{
            System.out.println("Not, Palindrome Number");
        }
    }
}
