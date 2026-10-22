//Check whether a number is an Armstrong number.
import java.util.Scanner;

public class pract36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int temp=num;

        int digit=0;

        int sum=0;

        while (temp>0) {
            digit++;
            temp=temp/10;
            
        }

        temp=num;

        

        while (temp>0) {

          int save=temp%10;

          int power=1;

          for(int i=1;i<=digit;i++){

             power=power*save;

          }

          sum=sum+power;

          temp=temp/10;


            
        }

       

if(num==sum){
    System.out.println("it is amstrong number");
}
else{
    System.out.println("it is not");
}
        
        
    }
    
}
