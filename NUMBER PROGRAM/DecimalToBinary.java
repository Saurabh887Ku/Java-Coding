import java.util.Scanner;
public class DecimalToBinary{
    public static void decimalToBinary(int num){
        int binary = 0;
        int power = 1;
        while(num > 0){
            int mod = num % 2;
            binary = binary + mod * power; // 8 -> 0 0 0 1 -> 1000
            power *= 10;
            num /= 2;
        }
        System.out.println(binary);
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        decimalToBinary(num);
    }
}