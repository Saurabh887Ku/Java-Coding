import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddFrequency {
    public static void frequencyOfOdd(int[] arr){
        // int[] freq = new int[arr.length];
        // for(int i=0; i<arr.length; i++){
        //     freq[i] = -1;
        // } // 1 2 2 3 3 4
        // for(int i=0; i<arr.length; i++){
        //     int count = 1;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //             freq[j] = 0; // [1,2,0,2,0,1]
        //         }
        //     }
        //     if(freq[i] != 0){
        //         freq[i] = count;
        //     }
        // }
        // for(int i=0; i<arr.length; i++){
        //     if(freq[i] % 2 == 1){
        //         System.out.println(arr[i] + " "+freq[i]);
        //     }
        // }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
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
        frequencyOfOdd(arr);
    }
}
