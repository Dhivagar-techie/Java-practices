//[ ] Check whether a number is a factorial number.
import java.util.*;
public class pract44 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int first=0;
        int second=1;
        for(int i=1;i<=num;i++){
           
 System.out.print(first+" ");

   int third=first+second;

   first=second;
   second=third;
   



        }



    }
}