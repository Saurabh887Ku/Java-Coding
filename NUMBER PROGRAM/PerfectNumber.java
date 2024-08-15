
import java.util.Scanner;
public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        int sum=0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a test case");
        int testCase = sc.nextInt();
        int j=1;
        while(j++ <= testCase){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(isPerfectNumber(num)){
                System.out.println("Yes, Perfect Number");
            }
            else{
                System.out.println("Not, Perfect Number");
            }
        }
    }
}
