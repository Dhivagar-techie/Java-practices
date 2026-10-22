//Check whether a number is prime.
import java.util.Scanner;

public class pract18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number: ");
        int num=sc.nextInt();

        boolean flag=true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
            }



        }

        if(flag){
            System.out.println(num+" is prime");
        }
        else{
            System.out.println("not prime");
        }

    }
    
}
