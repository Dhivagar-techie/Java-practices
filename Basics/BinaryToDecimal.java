import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        String num= sc.next();

       
        
       int decimal=Integer.parseInt(num,2);
        
        System.out.println("Decimal "+decimal);
    }
    
}
