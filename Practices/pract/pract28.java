//Count even and odd digits
import java.util.Scanner;

public class pract28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        int temp=num;

        int even=0;
        int odd=0;
        while (temp>0) {

            int digit=temp%10;
             
            if(digit%2==0){
                even++;

            }
            else{
      odd++;
            }

            temp=temp/10;
            
        }

        System.out.println("odd of digit: "+odd);
        System.out.println("even of digit: "+even);
    }
    
}
