
import java.util.Scanner;
public class RivenNumber {
    public static boolean isRivenNumber(int num){
        int sum=0,temp=num;
        if(num >= 10) {
            while (num > 0) {
                int mod = num % 10;
                sum += mod;
                num /= 10;
            }
        }
        if(temp % sum == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        if(isRivenNumber(num)){
            System.out.println("Yes, Riven Number");
        }
        else{
            System.out.println("Not, Riven Number");
        }
    }
}
