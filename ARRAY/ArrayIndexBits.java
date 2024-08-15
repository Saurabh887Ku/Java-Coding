import java.util.Scanner;
public class ArrayIndexBits {
    public static int getBits(int num){
        int count=0;
        while(num>0){
            int mod=num%2;
            if(mod==1){
                count++;
            }
            num/=2;
        }
        return count;
    }
    public static int[] arrayGetBits(int arr[],int size){
        for(int i=0; i<size; i++){
            arr[i]=getBits(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        arr=arrayGetBits(arr,size);
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
