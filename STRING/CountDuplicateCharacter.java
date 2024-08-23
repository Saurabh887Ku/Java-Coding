// Count duplicate character occured in given string
import java.util.Scanner;
public class CountDuplicateCharacter{
    public static void countDuplicateChar(String str){
        char arr[]=str.toCharArray();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            for(int j=i+1; j<str.length(); j++){
                if(arr[i] == arr[j] && arr[i] != ' '){
                    count++;
                    arr[j]='0';
                }
            }
            if(count > 1 && arr[i] != '0'){
                System.out.println(arr[i]+" "+count);
            }
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        countDuplicateChar(str);
    }
}