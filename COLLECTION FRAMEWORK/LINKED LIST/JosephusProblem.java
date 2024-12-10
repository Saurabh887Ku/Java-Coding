import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProblem {
    public static void josephusProblem(int num, int k){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<num; i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() != 1){
            index = (index + k-1) % list.size();
            list.remove(index);
        }
        System.out.println(list.get(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the problem");
        int num = sc.nextInt();
        System.out.println("Enter the k values");
        int k = sc.nextInt();
        josephusProblem(num, k);
    }
}
