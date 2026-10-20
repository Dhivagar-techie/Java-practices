import java.util.Scanner;

public class pract12 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int num=sc.nextInt();


        int temp=num;

        boolean divisible=true;

        while (temp>0) {

     int div=temp%10;
        
        
        if(div==0||num%div!=0){
           divisible=false;
        }        
          
        temp/=10;
        

        }

        if(divisible){
            System.out.println("it is divisible");
        }
        else{
            System.out.println("it is not");
        }
    }
}