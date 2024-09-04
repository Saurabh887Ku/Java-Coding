import java.util.Scanner;
public class LeftRotate{
    public static void leftRotation(int[] arr){
        int p = 1;
        while(p <= 2){
            int temp = arr[arr.length - 1];
            for(int i = arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            p++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        leftRotation(arr);
    }
}
