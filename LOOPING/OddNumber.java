public class OddNumber {
    public static void main(String[] args) {
        int start=50,end=25;
        while(start>=end){
            if(start%2==1){
                System.out.print(start+" ");
            }
            start--;
        }
    }
}
