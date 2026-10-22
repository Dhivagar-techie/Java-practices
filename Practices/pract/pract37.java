//Check whether a number is a perfect number.

import java.util.Scanner;

public class pract37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int temp=num;

        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(num==sum){
            System.out.println(num+" it is perfect number");
        }
        else{
            System.out.println("it is not");
        }
    }
    
}
