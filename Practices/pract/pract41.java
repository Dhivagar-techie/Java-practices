import java.util.*;
public class pract41 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");

        int num=sc.nextInt();

        int temp=num;

        int root=(int)Math.sqrt(temp);

        if(root*root==temp){
            System.out.println(num+" it is a perfect number");
        }

        else{
            System.out.println(" it is not a perfect number");
        }
    }
    
}
