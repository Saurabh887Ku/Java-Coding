import java.util.Scanner;
public class EvenPositionElement{
    public static void evenPositionElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        evenPositionElement(arr);
    }
}