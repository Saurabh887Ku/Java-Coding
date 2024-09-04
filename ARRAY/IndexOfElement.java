import java.util.Scanner;
public class IndexOfElement{
    public static int indexOfElement(int[] arr, int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element");
        int element = sc.nextInt();
        System.out.println(indexOfElement(arr,element));
    }
}