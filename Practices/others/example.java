import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Play Game");
            System.out.println("2. Options");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scanner.nextInt();
            
        } while (choice < 1 || choice > 3); // Keeps looping if input is invalid

        System.out.println("You selected valid option: " + choice);
        scanner.close();
    }
}
