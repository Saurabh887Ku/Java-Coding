
import java.util.Scanner;
public class BuzzNumber {
    public static boolean isBuzzNumber(int num){
        if(num % 7 == 0 || num % 10 == 7){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(isBuzzNumber(num)){
            System.out.println("Yes, Buzz Number");
        }
        else{
            System.out.println("Not, Buzz Number");
        }
    }
}
