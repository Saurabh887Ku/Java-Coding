import java.util.Scanner;
public class RemoveAllDuplicate{
    public static void removeAllDulicates(String str){
        String res = "";
        // for(int i=0; i<str.length(); i++){
        //     int j;
        //     for(j=0; j<i; j++){
        //         if(str.charAt(i) == str.charAt(j)){
        //             break;
        //         }
        //     }
        //     if(i == j){
        //         res+=str.charAt(i);
        //     }
        // }
        // System.out.println(res);
        int[] arr = new int[256];
        for(char ch : str.toCharArray()){
            if(arr[ch] == 0){
                res += ch;
                arr[ch]++;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        removeAllDulicates(str);
    }
}