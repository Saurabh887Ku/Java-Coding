import java.util.Scanner;
public class ReverseStringFromLast {
    public static void reverseString(String str){
        String str1 = "",res = "";
        for(int i=str.length()-1; i>=0; i--){
            str1 += str.charAt(i);
        }
        System.out.println(str1);
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch != ' '){
                res = res + ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        reverseString(str);
    }
}
