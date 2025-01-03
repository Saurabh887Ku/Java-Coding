import java.util.Scanner;
// 1 2 3 4 5
public class RotateArrayLeft {
    public static void rotateArrayLeftSide(int[] arr){
        int p=1;
        while(p <= 2){
            int last = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            p++;
        }
        for(int i : arr){
            System.out.print(i+" ");
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
        rotateArrayLeftSide(arr);
    }
}
