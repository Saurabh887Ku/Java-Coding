import java.util.Scanner;

public class AfterDecimalPoint {
    public static void afterDecimal(String str){
        int pos = str.indexOf(".");
        System.out.println(str.substring(++pos));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        afterDecimal(str);
    }
}
