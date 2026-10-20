import java.util.Scanner;

public class pract24 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int reverse=0;
        int temp=num;

        while (temp>0) {
            int sav=temp%10;
            reverse=reverse*10+sav;

            temp=temp/10;
            
        }

        System.out.println("reverse: "+reverse);
        System.out.println("Original : "+num);
    }
}
