
import java.util.Scanner;
public class CountFactor {
    public static int countFactor(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        System.out.println(countFactor(num));
    }
}
