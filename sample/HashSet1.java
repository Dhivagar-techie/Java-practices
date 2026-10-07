import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("abc");
        cars.add("abc");
        cars.add("abc");
        cars.add("abc");
        cars.add("abc");

        System.out.println(cars);

    }

}
