import java.util.Scanner;
public class MostFrequentElement{
    public static void mostFrequencyElement(int[] arr){
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
        int maxi = arr[0], element = 0;
        for(int i=0; i<arr.length; i++){
            if(freq[i] > maxi){
                maxi = freq[i];
                element = i;
            }
        }
        System.out.println(arr[element]+" "+freq[element]);
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        mostFrequencyElement(arr);
    }
}