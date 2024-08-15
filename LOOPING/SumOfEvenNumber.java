public class SumOfEvenNumber {
    public static void main(String[] args) {
        int start = 15, end = 40, sum = 0;
        while (start <= end) {
            if (start % 2 == 0) {
                sum += start;
            }
            start++;
        }
        System.out.println(sum);
    }
}
