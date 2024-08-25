import java.util.Scanner;
public class AfterDecimal {
    public static void printDigitAfterDecimal(String str){
        int pos = str.indexOf(".");
        System.out.println(str.substring(++pos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        printDigitAfterDecimal(str);
    }
}
