import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your Input :");
        int num=sc.nextInt();

        if (num%5==0 && num%3==0){
            System.out.println("Fizz BUzz");

        }
        else if (num%5==0){
            System.out.println("Fizz ");

        }
        else if (num%3==0){
            System.out.println("Buzz ");
    }
    else{
        System.out.println("Invalid");
    }
    
}

}