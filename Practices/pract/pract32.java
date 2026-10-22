//Remove all occurrences of a given digit.
import java.util.*;

public class pract32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int num = sc.nextInt();

        System.out.println("enter the target number : ");
        int remove = sc.nextInt();

        ArrayList<Integer> Final = new ArrayList<>();

        String str = String.valueOf(num);

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit != remove) {
                Final.add(digit);
            }
        }
        System.out.print(Final + " ");

    }

}
