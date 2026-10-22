//Check whether a year is a leap year.
import java.util.Scanner;

public class pract6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the year :");
        int num=sc.nextInt();

        if(num%400==0 && num%100==0||num%4==0){
            System.out.println(num+" it is a leap year");

        }
        else{
            System.out.println("it is not a leap year");
        }
    
    }
}
        