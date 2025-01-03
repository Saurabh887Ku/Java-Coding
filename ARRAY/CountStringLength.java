import java.util.Scanner;
// For the given array of Strings, print and count all the Strings which has even number of characters.

public class CountStringLength {
    public static void countStringCharacter(String[] arr){
        int count = 0;
        for(String str : arr){
            System.out.println(str);
            if(str.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        String[] arr = new String[size];
        sc.nextLine();
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextLine();
        }
        countStringCharacter(arr);
    }
}
