import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        
        System.out.print("enter the number : ");
        int num=Sc.nextInt();

        if (num>0){
            System.out.println(num+" is a +ve number");
        }
        else if(num<0){
            System.out.println(num+" is a -ve number");

        }
        else{
            System.out.println(num+" is a zero");
        }
    }

    
}
