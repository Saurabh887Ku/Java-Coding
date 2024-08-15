
import java.util.Scanner;

public class DisariumNumber {
    public static boolean isDisarium(int num){

        int count=0,result=num,sum=0,temp = num;
        while(num > 0){
            count++;
            num /= 10;
        }
        while(result > 0){
            int mod = result % 10;
            int res=(int)Math.pow(mod,count);
            sum += res;
            result /= 10;
            count--;
        }
        if(sum == temp){
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
            if(isDisarium(num)){
                System.out.println("Yes, Disarium Number");
            }
            else{
                System.out.println("Not, Disarium Number");
            }
        }
    }
}
