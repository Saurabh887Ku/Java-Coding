import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequency {
    public static void maximumArrayFrequency(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getKey();
            }
        }
        System.out.println("Maximum element in the array => "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
}
