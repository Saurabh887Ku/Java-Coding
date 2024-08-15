import java.util.Scanner;
public class ArmstrongNumber {
    
    public static boolean isArmstrongNumber(int num){

        int sum=0,res=num;
        while(num > 0){
            int mod = num % 10;
            int cube = mod * mod * mod;
            sum += cube;
            num /= 10;
        }
        if(res != sum){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter test case number");
        int testCase=sc.nextInt();
        int j=1;
        while(j++ <= testCase){
            System.out.println("Enter a number ");
            int num=sc.nextInt();
            if(isArmstrongNumber(num)){
                System.out.println("Yes, Armstrong Number");
            }
            else{
                System.out.println("Not, Armstrong Number");
            }
        }
    }
}

