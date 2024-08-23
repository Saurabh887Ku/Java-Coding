// Check the given string is palindrome or not.
import java.util.Scanner;
public class Palindrome{
    public static boolean isPalindromeString(String str){
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        if(res.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        if(isPalindromeString(str)){
            System.out.println("Yes, Palindrome String");
        }
        else{
            System.out.println("Not, Palindrome String");
        }
    }
}