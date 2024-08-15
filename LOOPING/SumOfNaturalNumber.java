
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int end=sc.nextInt();
        int start=1,sum=0;
        while(start<=end){
            sum+=start;
            start++;
        }
        System.out.println(sum);
    }
}
