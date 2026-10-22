import java.util.*;

public class largest_num {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        int largest=0;
        int smallest=9;
        int sum=0;

        while(num>0){

            int digit=num%10;
            
            if (digit >largest){
                largest=digit;}
            
            if (digit < smallest){
                  smallest=digit;}
            
            sum=sum+digit;

            num=num/10;
        }
        System.out.println("largest :"+largest);
        System.out.println("smallest :"+smallest);
        System.out.println("sum :"+sum);
    }
}
