//Find the largest digit in a number.
import java.util.Scanner;

public class pract27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int temp=num;

        int largest=0;

        while (temp>0) {

            int digit=temp%10;
             
            if(largest<digit){
                largest=digit;

            }

            temp=temp/10;


            
        }

        System.out.println("largest of digit: "+largest);
    }
    
}
