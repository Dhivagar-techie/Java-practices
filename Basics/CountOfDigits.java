import java.util.*;
public class CountOfDigits {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int temp= Math.abs(num);

        int count=0;


        if (num==0){
            count=1;
        }
        else{
            
            while(temp!=0){
           temp= temp/10;
            count++;

        }

        
        }

        System.out.println("no of times is"+count);
        
    }
    
}
