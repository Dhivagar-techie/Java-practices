import java.util.*;

public class example {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Swiggy\n");

        System.out.println(
            "Hotel\n---------\n" +
            "1. Buhari\n" +
            "2. A2B\n" +
            "3. Amma_canteen\n" +
            "4. Appa_canteen"
        );

        int opt = sc.nextInt();

        int button = opt;

        switch (button) {

            case 1 -> {
                System.out.println("1. Chicken biriyani\n2. Mutton biriyani");
            }

            case 2 -> {
                System.out.println("1. Chicken biriyani\n2. Mutton biriyani");
            }

            case 3 -> {
                System.out.println("1. Chicken biriyani\n2. Mutton biriyani");
            }

            case 4 -> {
                System.out.println("1. Chicken biriyani\n2. Mutton biriyani");
            }

            default -> {
                System.out.println("Invalid hotel option");
            }
        }
    }
}