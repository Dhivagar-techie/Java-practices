//Check whether a number is divisible by 5 and 11.
import java.util.Scanner;

public class pract7 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int num=sc.nextInt();
    

        if(num%5==0 && num%11==0){
            System.out.println("it is divisble");
        }
        else{
            System.out.println("it is not");
        }
    }
}
        