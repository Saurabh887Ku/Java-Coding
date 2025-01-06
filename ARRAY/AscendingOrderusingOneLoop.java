public class AscendingOrderusingOneLoop {
    public static void ascendingOrderOneLoop(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){ // 5, 7, 9, 10, 9, 3, 1, 0, 4
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,10,9,3,1,0,4};
        ascendingOrderOneLoop(arr);
    }
}
