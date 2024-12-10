import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int num){
        String str = "";
        while(num > 0){
            str = (num % 2) + str;
            num /= 2;
        }
        System.out.println(str); 
        // int binary = 0;
        // int power = 1;
        // while(num > 0){
        //     int mod = num % 2;
        //     binary = binary + mod * power;
        //     power *= 10;
        //     num /= 2;
        // }
        // System.out.println(binary);

        // int decimal = 0, base = 0;
        // while(num > 0){
        //     int mod = num % 10;
        //     decimal = decimal + mod * (int)Math.pow(2,base);
        //     base++;
        //     num /= 10;
        // }
        // System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        decToBin(num);
    }
}
