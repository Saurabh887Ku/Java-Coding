import java.util.Scanner;

public class FrequencyOfEachElement1 {
    public static void frequencyOfEachElement(int [] arr){
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
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
