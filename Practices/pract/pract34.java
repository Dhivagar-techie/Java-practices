//Swap the first and last digits.
import java.util.ArrayList;
import java.util.Scanner;

public class pract34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");
        int num = sc.nextInt();

        String str = String.valueOf(num);

        ArrayList<Integer> Result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            Result.add(Character.getNumericValue(str.charAt(i)));

        }

        int temp = Result.get(0);

        Result.set(0, Result.get(Result.size() - 1));

        Result.set(Result.size() - 1, temp);

        System.out.println(Result);

    }
}
