import java.util.Scanner;

public class NoOfTimes {
    
    public static void pattern(int num) {
        

       int state=0;

        while (num>0) {

        int reversed=num%10;

        state=(state*10)+reversed;

        num=num/10;
            
            
        }
        
      int temp=state;

      while (temp>0) {

        int digit = temp%10;

        int count=0;

        while (count<digit) {

            System.out.print(digit);

            count++;        
        }

        System.out.println();

        temp=temp/10;

      }
    }
    

public static void main(String[] args){
     Scanner sc =new Scanner(System.in);

    System.out.print("Enter the number : ");
        int num=sc.nextInt();
        pattern(num);

}
}