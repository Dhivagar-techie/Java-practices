//Print all prime numbers from 1 to N.
import java.util.Scanner;

public class pract20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the ending number: ");

        int num = sc.nextInt();

        int count = 0;

        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.print(i+" ");
                count++;

            }
        }

        System.out.println("count : "+count);

    }

}
