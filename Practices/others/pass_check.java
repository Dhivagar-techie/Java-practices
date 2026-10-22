import java.util.*;

public class pass_check{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int password=0000;
        System.out.print("enter your password:");
        int valid=sc.nextInt();

        while (password !=valid) {
            System.out.println("Entered password is wrong");

            System.out.println("try Again!");

            System.out.print("enter your password:");
             valid=sc.nextInt();
            
        }
        System.out.println("Your password was correct");
    }
}