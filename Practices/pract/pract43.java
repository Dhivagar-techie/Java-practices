//Check whether a number is a factorial number.
import java.util.*;
public class pract43 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int temp=num;

        int diverser=1;
        
        while (temp%diverser==0) {

            temp=temp/diverser;
            
            diverser++;
            
        }

        if(temp==num){
            System.out.println("it is factorial");
        }
        else{
            System.out.println("it is not");
        }



    }
}


