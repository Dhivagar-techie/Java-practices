//Print an inverted right-angled triangle.
public class pract55 {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("--- right-inverted-Aligned Triangle ---");

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rows - i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}