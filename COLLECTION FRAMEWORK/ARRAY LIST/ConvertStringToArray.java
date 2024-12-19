import java.util.ArrayList;
import java.util.List;
// Convert a List of strings to an array and print the array.

public class ConvertStringToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ankita");
        list.add("saurabh");
        list.add("vishal");
        list.add("amarjeet");
        list.add("ritik");
        String[] arr = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            // String str = list.get(i);
            // arr[i] = str;
            arr[i] = list.get(i);
        }
        for(String str : arr){
            System.out.print(str+" ");
        }
    }
}
