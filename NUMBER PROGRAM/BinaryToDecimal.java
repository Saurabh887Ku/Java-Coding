import java.util.Scanner;
public class BinaryToDecimal{
    public static void binaryToDecimal(int num){
        int decimal = 0,i=0;
        while(num > 0){
            int mod = num % 10;
            decimal = decimal + mod * (int)Math.pow(2, i);
            num /= 10;
            i++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        binaryToDecimal(num);
    }
}