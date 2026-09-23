import java.util.*;
public class A2{
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        
        System.out.print("enter the number 1 : ");
        int a=Sc.nextInt();
        System.out.print("enter the number 2 : ");
        int b=Sc.nextInt();
        System.out.print("enter the number 3: ");
        int c=Sc.nextInt();

        if (a>=b&&a>=c){
            System.out.println(a+" is a largest number");
        }
        else if(b>=a&&b>=c){
            System.out.println(b+" is a largest number");

        }
        else{
            System.out.println(c+" is largest number");
        }
    }

    
}
