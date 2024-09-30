import java.util.Scanner;
public class StartWithVowelInArray {
    public static void startWithVowel(String[] str){
        for(int i=0; i<str.length; i++){
            char ch = str[i].charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                System.out.println(str[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string ");
        int size = sc.nextInt();
        System.out.println("Enter string values");
        sc.nextLine();
        String[] str = new String[size];
        for(int i=0; i<size; i++){
            str[i] = sc.nextLine();
        }
        System.out.println("These are the vowel first letter element");
        startWithVowel(str);
    }
}
