public class PrintEven {
    public static void main(String[] args) {
        int start=70,end=30;
        while(start>=end){
            if(start%2==0){
                System.out.print(start+" ");
            }
            start--;
        }
    }
}
