import java.util.Scanner;
public class WithoutZeroOne {
    public static boolean withOutZeroAndOne(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0 || arr[i] == 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        if(withOutZeroAndOne(arr)){
            System.out.println("WIthout zero and one");
        }
        else{
            System.out.println("WIth zero and one");
        }
    }
}