
import java.util.Scanner;
class AutomorphicNumber{
    
    public static boolean isAutomorphicNumber(int num){
        int square=num*num;
        int lastDigit=square%10;
        if(lastDigit==num){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isAutomorphicNumber(num)){
            System.out.println("Yes, Automorphic Number");
        }
        else{
            System.out.println("Not, Automorphic Number");
        }
    }
}