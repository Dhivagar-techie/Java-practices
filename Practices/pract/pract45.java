//Print the Fibonacci series.
import java.util.*;
public class pract45 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int intial=1;

        for(int i=num;i>1;i--){

            intial=intial*i;

        }
          System.out.println(intial+" ");
        

    }
    
}