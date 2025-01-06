import java.util.Arrays;
public class RemoveAllDuplicates {
    public static int[] moveZero(int[] array){
        int n=array.length;
        int index=0;
        for (int i : array) {
            if(i !=0){
                array[index]=i;
                index++;
            }
        }
        while(index<n){
            array[index]=0;
            index++;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {7, 0, 2, 6, 0, 4};
        moveZero(array); 
        System.out.println(Arrays.toString(array));

        // int[] final=moveZero(array);
        // for (int i : array) { 
        //     System.out.println(i);
        // }
        int [] res = moveZero(array);
        for(int i:res){
            System.out.println(i+" ");
        }
    }
}
