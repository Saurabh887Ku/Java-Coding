// Find maximum character occurs in given string.
import java.util.Scanner;
public class MaximumCharString{
    
    public static void maxiStringOccur(String str){
        int arr[] = new int[256];
        int count = 0;
        char ch1 = ' ';
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch]++;
            if(arr[ch] > count){
                count = arr[ch];
                ch1 = ch;
            }
        }
        System.out.println(ch1 + " " + count);
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        // System.out.println(maxiStringOccur(str));
        maxiStringOccur(str);
    }
}