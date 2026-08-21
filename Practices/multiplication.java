import java.util.*;
public class multiplication {
    public static void multiply(int num) {
       
       int reverse=0;
       int temp1=num;

        while (temp1>0) {

          int  store1=temp1%10;

          reverse=(reverse*10)+store1;

         temp1=temp1/10;           
        }

        int temp=reverse;

       while (temp>0) {
        int store=temp%10;

       int count=1;
       while (count<=10) {
        System.out.println(count+" x "+store+" = "+count*store);
        count++;
       }
       System.out.println();
       temp=temp/10;
        
       }
      

    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num=sc.nextInt();
    multiply(num);
}
    
}


