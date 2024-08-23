// Count each character occured in given string
import java.util.Scanner;
public class CountEachCharacter{
    public static void countCharacterOccurence(String str){
        int []arr = new int[256];
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[i] != ' ')
                System.out.println((char)i+" "+arr[i]);
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        countCharacterOccurence(str);
    }
}