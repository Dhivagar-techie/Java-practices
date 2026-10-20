import java.util.Scanner;

public class pract25 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int temp=num;
        int reverse=0;


     while (temp>0) {
        int rev=temp%10;
        reverse=reverse*10+rev;
        temp=temp/10;

        
     }

       if(num==reverse){
        System.out.println("it is paliandrom");
       }
       else{
        System.out.println("it is not");
       }
    }
}
