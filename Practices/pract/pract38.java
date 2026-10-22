//Check whether a number is a sunny number.
import java.util.*;
public class pract38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");

        int num=sc.nextInt();


        int temp=num+1;

        int root=(int)Math.sqrt(temp);

        if(root*root==temp){
            System.out.println("it is a sunny nnumber");

        }
        else{
            System.out.println("it is not");
        }


    }

    
}
