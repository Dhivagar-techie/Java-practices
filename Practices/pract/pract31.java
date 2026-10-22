//Find the second-largest digit.
import java.util.Scanner;

public class pract31 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();
      

        int temp=num;

        int firstLarge=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        while (temp>0) {

            int digit=temp%10;

            if (digit>firstLarge){
                secondLarge=firstLarge;
                firstLarge=digit;
                
            }
            else if( secondLarge<digit && digit !=firstLarge){
                secondLarge=digit;

            }
            temp=temp/10;


        }


System.out.println("First: "+firstLarge);
System.out.println("Second : "+ secondLarge);

    }
    
}
