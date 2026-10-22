//Find factorial using recursion.
import java.util.*;
public class pract46 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

       if(num<0){
        System.out.println("cant be a negative number");

       }
       else if(num>20){
        System.out.println(" number is too large  ");
       }
       else{
        System.out.println("factorial "+fact(num));
       }

    
    }
    

      static long fact(int num){

        if(num==0||num==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }

       }
}