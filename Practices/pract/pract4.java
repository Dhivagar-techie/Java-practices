//Swap two numbers using a third variable.
import java.util.Scanner;

public class pract1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int a=12;
       int b=34;

       System.out.println("befor");
       System.out.println("a:"+a+" and  b:"+b);


       int temp=a;
       a=b;
       b=temp;


       System.out.println("After");
       System.out.println("a:"+a+" and  b:"+b);


    
    }
}