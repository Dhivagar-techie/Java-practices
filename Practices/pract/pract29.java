//Check whether a number is a strong number


import java.util.Scanner;

public class pract29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int temp=num;

        int sum=0;

       while (temp>0) {
        int sav=temp%10;

        int fact=1;

        for(int i=sav;i>=1;i--){
            fact=fact*i;
        }

       sum=sum+fact;

        temp=temp/10;

        
       }

        if(num==sum){
            System.out.println(num+" it is strong number");
        }
        else{
            System.out.println("it is not");
        }
    }
    
}
