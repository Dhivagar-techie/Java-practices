import java.util.*;
public class FirstToLastWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter yor Stating number :");
        int first=sc.nextInt();
        
        System.out.print("enter yor Ending number :");
        int Last=sc.nextInt();


        while(first<=Last){
            System.out.println(first);
            first++;
        }
    }
    
}
