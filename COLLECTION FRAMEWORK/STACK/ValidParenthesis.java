import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(char a, char b){
        if(a == '(' && b == ')'){
            return true;
        }
        else if(a == '[' && b == ']'){
            return true;
        }
        else if(a == '{' && b == '}'){
            return true;
        }
        return false;
    }
    public static boolean isParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty() == true){
                    return false;
                }
                else if(isValid(stack.peek(), ch) == false){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() == true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parenthesis string");
        String str = sc.nextLine();
        if(isParenthesis(str)){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Not Valid Parenthesis");
        }
    }
}
