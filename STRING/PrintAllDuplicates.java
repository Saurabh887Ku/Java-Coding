import java.util.Scanner;
public class PrintAllDuplicates{
    public static void printAllDuplicates(String str){
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && arr[j] != ' '){
                    count++;
                    arr[j] = '0';
                }
            }
            if(arr[i] != '0' && count > 1){
                System.out.println(arr[i] +" " + count);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        printAllDuplicates(str);
    }
}