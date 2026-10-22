//prime factors
import java.util.Scanner;

public class pract21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;

            }
        }
    }

}
