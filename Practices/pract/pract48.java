//Find the sum of squares from 1 to N.
import java.util.*;
public class pract48 {

    static squre(int num){

       

        if (num==1){
            return 1;
        }
        else{

          return  num*num+squre(num-1);
        }


    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        System.out.println(squre(num));




    }
}
