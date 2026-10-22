//Count the digits in a number.
import java.util.Scanner;

public class pract22 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int count=0;
        int temp=num;

        while (temp>0) {
            count++;
            temp=temp/10;
            
        }

        System.out.println("count: "+count);
    }
}
