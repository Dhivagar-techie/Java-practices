//Count occurrences of a particular digit.
import java.util.Scanner;

public class pract30 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("enter the  target number : ");
        int target=sc.nextInt();

        int temp=num;

        int count=0;

        while (temp>0) {

            int digit=temp%10;

            if (digit==target){
                count++;
                
            }
            temp=temp/10;


        }


System.out.println("count : "+count);

    }
    
}
