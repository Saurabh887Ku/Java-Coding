import java.util.Scanner;
public class PrimeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int mod = num % 10;
            if(mod == 2 || mod == 3 || mod == 5 || mod == 7){
                sum += mod;
            }
            num /= 10;
        }
        System.out.println(sum);
    }
}
