import java.util.*;

public class Test16 {
    public static void main(String[] args) {
        Integer[] arr = {12, 456, 89, 23, 57, 89, 35, 80, 235, 6, 42, 73};
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr));

         Collections.sort(num,Collections.reverseOrder());

        System.out.println(num.get(0));

    }
}

        