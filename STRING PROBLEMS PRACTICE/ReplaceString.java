// Write a Java program to replace a specified character with another character.

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String newStr = str.replace('e','d');
        System.out.println(newStr);
    }
}
