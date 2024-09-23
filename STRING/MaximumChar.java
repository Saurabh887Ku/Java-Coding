import java.util.Scanner;
public class MaximumChar{
    public static void maximumCharacter(String str){
        int[] arr = new int[256];
        char ch = ' ';
        int max=0;
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            arr[ch1]++;
            if(arr[ch1] > max){
                max = arr[ch1];
                ch = ch1;
            }
        }
        System.out.println(ch+" "+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str = sc.nextLine();
        maximumCharacter(str);
    }
}