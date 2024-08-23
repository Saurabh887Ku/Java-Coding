// Sort the given string 
import java.util.Scanner;
public class SortTheString {
    public static void sortString(String str){
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
        public static void main(String[] Saurabh){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string ");
            String str = sc.nextLine();
            sortString(str);
        }
}
