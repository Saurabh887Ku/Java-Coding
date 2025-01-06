public class BinaryRepresentationArray {
    public static int binary(int n){
        int bin = 0, i = 1;
        while(n > 0){
            int mod = n % 2;
            bin = bin + mod * i;
            i *= 10;
            n = n / 2;
        }
        return bin;
    }
    public static void binaryArrayRepresentation(int n){
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            // int bin = binary(i);
            // res[i] = bin;
            res[i] = binary(i);
        }
        for(int i : res){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        binaryArrayRepresentation(n);
    }
}
