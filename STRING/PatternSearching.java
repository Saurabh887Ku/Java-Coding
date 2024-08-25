import java.util.Scanner;
public class PatternSearching{
    public static void patternSearching(String str, String pattern){
        int pos = str.indexOf(pattern);
        while(pos >= 0){
            System.out.print(pos+" ");
            pos = str.indexOf(pattern, pos+1);
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter a pattern to be searched");
        String pattern = sc.nextLine();
        patternSearching(str, pattern);
    }
}