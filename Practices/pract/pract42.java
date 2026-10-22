import java.util.*;
public class pract42 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");

        int num=sc.nextInt();

        int temp=num;

        int i=0;

        while ( i*i*i<num) {
           i++;

        }

        if(i*i*i==temp){
            System.out.println(num+" it is a perfect number");
        }

        else{
            System.out.println(" it is not a perfect number");
        }
    }
    
}
