// Write a Java program to test if a given string contains the specified sequence of char values.

import java.util.Scanner;

public class StringContainsOrNot {
    public static void containsOrNot(String str, String search){
        System.out.println(str.contains(search));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter searched string");
        String search = sc.nextLine();
        containsOrNot(str, search);
    }
}
