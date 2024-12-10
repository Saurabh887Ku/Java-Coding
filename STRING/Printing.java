import java.util.Scanner;

public class Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println("Second string or character");
        String str1 = sc.nextLine();
        int pos = str.indexOf(str1);
        while(pos >= 0){
            System.out.println(pos);
            pos = str.indexOf(str1, pos+1);
        }
    }
}
