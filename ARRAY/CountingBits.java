import java.util.Scanner;

public class CountingBits {
    public static int binaryOneBits(int num){
        int count = 0;
        while(num > 0){
            count = count + num % 2;
            num /= 2;
        }
        return count;
    }
    public static void countingBits(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int ans = binaryOneBits(arr[i]);
            res[i] = ans;
        }
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int[] arr = new int[num+1];
        for(int i=0; i<num+1; i++){
            arr[i] = i;
        }
        countingBits(arr);
    }
}
