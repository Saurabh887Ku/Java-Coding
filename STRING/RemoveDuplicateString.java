// remove duplicate characters from string
import java.util.Scanner;
public class RemoveDuplicateString{
    public static void removeDuplicate(String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            int j;
            for(j=0; j<i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    break;
                }
            }
            if(i == j){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        removeDuplicate(str);
    }
}