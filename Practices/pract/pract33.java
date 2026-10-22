//Find the largest prime factor of a number.
import java.util.*;
public class pract33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();

        TreeSet <Integer> store=new TreeSet<>();

        for(int i=2;i<num;i++){
 
            if(num%i==0){
                store.add(i);
                num=num/i;

            }
        }
         if (!store.isEmpty()) {
            System.out.println("Largest prime factor is: " + store.last());
        }
    }
    
}
