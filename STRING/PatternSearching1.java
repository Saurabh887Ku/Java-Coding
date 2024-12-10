import java.util.Scanner;

public class PatternSearching1 {
    public static void patternSearch(String str, String pattern){
        int pos = str.indexOf(pattern);
        while(pos >= 0){
            System.out.print(pos+" ");
            pos = str.indexOf(pattern,pos+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter pattern to be searched");
        String pattern = sc.nextLine();
        patternSearch(str, pattern);
    }
}
