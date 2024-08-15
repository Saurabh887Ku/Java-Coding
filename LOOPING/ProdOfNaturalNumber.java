public class ProdOfNaturalNumber {
    public static void main(String[] args) {
        int start=1,end=10;
        int product=1;
        while(start<=end){
            product*=start;
            start++;
        }
        System.out.println(product);
    }
}
