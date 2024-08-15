import java.util.Scanner;
public class ReverseString {
    public static String reverseString(String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            result += str.charAt(str.length()-i-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
}
