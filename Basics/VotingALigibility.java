import java.util.*;

public class VotingALigibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age =sc.nextInt();

        if (age>100) {
            System.out.println(age + " is not Agigible for voting");

        } else if (age > 18) {
            System.out.println(age + " they are eligeble");

        } else {
            System.out.println(age + " they are not eligible");
        }

    }

}
