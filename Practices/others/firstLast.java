import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int lastDigit=num%10;
        int firstDigit=num;
        int sum=0;
      

        while (firstDigit>=10) {
            firstDigit=firstDigit/10;
            
            
        }
        int temp=num;
        while (temp>10) {
          int digit=temp%10;
            sum=sum + digit;
            temp=temp%10;
            
        }
        
        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
        System.out.println("sum of digits : "+sum);

    
        }

    }
