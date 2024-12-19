import java.util.Set;
import java.util.TreeSet;
// Given a TreeSet of integers, find the nearest lower and higher numbers of a given number.

public class FloorCeiling {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(35);
        set.add(57);
        set.add(55);

        int num = 25;

        int ceil = set.ceiling(num); // nearest higher value
        int flor = set.floor(num);   // nearest lower value
        System.out.println(ceil);
        System.out.println(flor);
    }
}
