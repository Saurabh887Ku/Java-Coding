public class ZeroOneTwo {
    public static void zeroStartOneMidTwoLast(int[] arr){
        int start = 0, end = arr.length-1, mid = 0;
        while(mid <= end){
            if(arr[mid] == 0){ // 0, 0, 0, 1, 1, 2, 2, 2 
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++; 
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--; 
            }
            else{
                mid++;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 2, 1, 0, 2};
        zeroStartOneMidTwoLast(arr);
    }
}
