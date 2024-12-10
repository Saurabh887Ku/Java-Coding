import java.util.Scanner;
import java.util.Stack;

public class IsParenthesis {
    public static boolean isRight(char a , char b){
        if(a == '{' && b == '}'){
            return true;
        }
        else if(a == '(' && b == ')'){
            return true;
        }
        else if(a == '[' && b == ']'){
            return true;
        }
        return false;
    }
    public static boolean isParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty() == true){
                    return false;
                }
                else if(isRight(s.peek(), ch) == false){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return s.isEmpty() == true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parenthesis string");
        String str = sc.nextLine();
        if(isParenthesis(str)){
            System.out.println("Parenthesis is valid");
        }
        else{
            System.out.println("Parenthesis is not valid");
        }
    }
}
