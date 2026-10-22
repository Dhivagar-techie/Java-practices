//Find the Lcm of two numbers.
import java.util.Scanner;

public class pract15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = Math.max(a, b);

        for (int i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM: " + i);
                break;
            }
        }

   
    }
}
