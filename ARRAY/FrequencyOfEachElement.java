import java.util.Scanner;
public class FrequencyOfEachElement{
    public static void frequencyOfEachElement(int[] arr){
        int freq[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            freq[i] = -1;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(freq[i] >= 1){
                System.out.println(arr[i]+" "+freq[i]);
            }
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        frequencyOfEachElement(arr);
    }
}