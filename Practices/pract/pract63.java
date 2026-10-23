//Duplicated values
import java.util.*;

public class pract63 {
    public static void main(String[] args) {

        int[] arr = { 12, 23, 45, 67, 78, 45, 67 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[j]);
                }

            }
        }

    }

}
