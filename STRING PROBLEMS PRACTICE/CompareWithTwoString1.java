// Write a Java program to compare two strings lexicographically, ignoring case differences.

import java.util.Scanner;

public class CompareWithTwoString1 {
    public static void compareWithStrings(String str, String str1){
        int res = str.compareToIgnoreCase(str1);
        if(res == 0){
            System.out.println("First and second both strings are equal");
        }
        else if(res > 0){
            System.out.println("First string is greater than second string");
        }
        else{
            System.out.println("First string is smaller than second string");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str = sc.nextLine();
        System.out.println("Enter the second string");
        String str1 = sc.nextLine();
        compareWithStrings(str, str1);
    }
}
