import java.util.Scanner;
public class FirstLetterCap {
    public static void FirstLetterCapital(String str){
        // char[] arr = str.toCharArray();
        // boolean flag = true;
        // for(int i=0; i<arr.length; i++){
        //     if(Character.isLetter(arr[i])){
        //         if(flag){
        //             arr[i] = Character.toUpperCase(arr[i]);
        //             flag = false;
        //         }
        //     }
        //     else{
        //         flag = true;
        // }
        String result ="";
        if(str.charAt(0) >= 97 && str.charAt(0) <= 122){
            result += (char)(str.charAt(0)-32);
        }
        for(int i=1; i<str.length(); i++){
            if(' ' == str.charAt(i) && (str.charAt(i+1) >= 97 && str.charAt(i) <= 122)){
                result = result +" "+ (char)(str.charAt(i+1)-32);
                i++;
            }
            else{
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
        // for(int i=0; i<arr.length; i++){
        //     arr[0] = Character.toUpperCase(arr[0]);
        //     if(arr[i] == ' '){
        //         arr[i+1] = Character.toUpperCase(arr[i+1]);
        //     }
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        FirstLetterCapital(str);
    }
}