////Find the sum of cubes from 1 to N.
import java.util.*;
public class pract49 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        int cube=0;

        for (int i=1;i<=num;i++){

           cube+=i*i*i;

        }

        System.out.println(cube);

    }
}