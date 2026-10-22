//Find the product of all factors.
import java.util.Scanner;

public class pract10 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number :");
        int num=sc.nextInt();

        int sum=1;

         for(int i=1;i<=num;i++){
            if(num%i==0){
               sum*=i;
            }
    }
    System.out.println("sum of factors are : "+sum);
}
}