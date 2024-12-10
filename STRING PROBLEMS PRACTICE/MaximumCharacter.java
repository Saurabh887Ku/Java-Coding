import java.util.Scanner;

public class MaximumCharacter {
    public static void maximumChar(String str){
        char[] ch = str.toCharArray();
        int[] arr = new int[str.length()];
        char ch1 = ' ';
        for(int i=0; i<str.length(); i++){
            arr[i] = 1;
            for(int j=i+1; j<str.length(); j++){
                if(ch[i] == ch[j] && ch[i] != ' ' && ch[i] != '0'){
                    arr[i]++;
                    ch[j] = '0';
                }
            }
        }
        int max = arr[0];
        for(int i=0; i<str.length(); i++){
            if(max < arr[i] && arr[i] != '0'){
                ch1 = ch[i];
                max = arr[i];
            }
        }
        System.out.println(ch1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        maximumChar(str);
    }
}
