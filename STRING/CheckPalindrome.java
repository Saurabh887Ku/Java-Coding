import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        /*String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        if(str.equals(res)){
            return true;
        }
        else{
            return false;
        }*/
        int start = 0;
        int end = str.length()-1;
        boolean isPalin = true;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                isPalin = false;
                break;
            }
            start++; end--;
        }
        if(isPalin == true){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome String");
        }
    }
}
