
import java.util.Scanner;
public class UglyNumber {
    public static boolean isUglyNumber(int num){
        while(num > 0){
            if(num % 2 == 0){
                System.out.print(2+" ");
                num /= 2;
            }
            else if(num % 3 == 0){
                System.out.print(3+" ");
                num /= 3;
            }
            else if(num % 5 == 0){
                System.out.print(5+" ");
                num /= 5;
            }
            else{
                break;
            }
        }
        if(num == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a test Case");
        int testCase=sc.nextInt();
        int j=1;
        while(j++ < testCase){
            System.out.println("\nEnter a number");
            int num=sc.nextInt();
            if(isUglyNumber(num)){
                System.out.println("\nYes, Ugly Number");
            }
            else{
                System.out.println("\nNot, Ugly Number");
            }
        }
    }
}
