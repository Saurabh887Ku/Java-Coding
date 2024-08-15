
import java.util.Scanner;
public class UniqueNumber {
    public static boolean isUniqueNumber(int num){
        int lastDigit = num % 10;
        num = num / 10;
        while(num > 0){
            int mod = num % 10;
            if(lastDigit == mod){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case number");
        int testCase=sc.nextInt();
        int j=1;
        while( j <= testCase){
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(isUniqueNumber(num)){
                System.out.println("Yes, Unique Number \n");
            }
            else{
                System.out.println("Not, Unique Number \n");
            }
            j++;
        }
    }
}
