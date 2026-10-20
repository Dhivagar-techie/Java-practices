import java.util.Scanner;

public class pract1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=10;
       int b=30;

       System.out.println("befor");
       System.out.println("a:"+a+" and  b:"+b);

       a=a+b;
       b=a-b;
       a=a-b;


       System.out.println("after");
       System.out.println("a:"+a+" and  b:"+b);

    }}
