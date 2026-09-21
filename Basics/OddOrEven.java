import java.util.*;
public class OddOrEven {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter your number : ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
        
    }
    
}
