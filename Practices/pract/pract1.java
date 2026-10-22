//Find whether a number is positive, negative, or zero.
import java.util.Scanner;

public class pract1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("it is positive");

        }
        else if(num<0){
            System.out.println("it is negative");
        }

        else{
            System.out.println("it is zero");
        }
    }
}
