public class MidAscendingOrder {
    public static void ascendingOrder(int[] arr){
        int size = arr.length;
        int mid = size/2;
        for(int i=0; i<mid-1; i++){
            for(int j=i+1; j<mid; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i=mid; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 34, 12, 45, 23, 28}; // 12 25 34 45 28 23
        ascendingOrder(arr);
    }
}
