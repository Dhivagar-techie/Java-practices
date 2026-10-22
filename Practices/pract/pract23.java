//Find the sum of digits.
import java.util.Scanner;

public class pract23 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int sum=0;
        int temp=num;

        while (temp>0) {
            
            int sav=temp%10;

            sum=sum+sav;

            temp=temp/10;
            
        }

        System.out.println("sum of digits :"+sum);
    }
}
