import java.util.Scanner;
public class TotalDuplicateElement{
    public static int findTotalDuplicateElement(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && arr[i] != -1){
                    count = count + 1;
                    arr[j] = -1;
                }
            }
        }
        return count;
    }
    public static void main(String[] Saurabh){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of element");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findTotalDuplicateElement(arr));
    }
}