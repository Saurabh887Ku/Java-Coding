// Swap two given string .
import java.util.Scanner;
public class SwapTwoString{
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(str1);
        System.out.println(str2);
    }
}