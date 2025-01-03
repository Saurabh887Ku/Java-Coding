import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Anagram{
    public static void main(String[] args) {
        String str = "ankita";
        String str1 = "kitanaa";
        List<Character> char1 = new  ArrayList<>();
        for(char ch : str1.toCharArray()){
            char1.add(ch);
        }
        
        List<Character> char2 = new  ArrayList<>();
        for(char ch : str1.toCharArray()){
                char2.add(ch);
        }

        if(char1.containsAll(char2)){
            System.out.println("Both strings are anagram");
        }
        else{
            System.out.println("Both strings are not anagram");
        }
    }
}