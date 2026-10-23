//Print an  right-angled triangle.
public class pract54 {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("--- right-Aligned Triangle ---");
        // Outer loop for rows (1 to 5)
        for (int i = 1; i <= rows; i++) {
            // Inner loop prints stars equal to the current row number
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}