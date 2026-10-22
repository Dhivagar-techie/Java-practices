//Find all numbers between 1 and N divisible by K.
import java.util.Scanner;

public class pract13 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int num=sc.nextInt();



        for (int i=1;i<100;i++){

            if(i%num==0){
                System.out.println(i);
            }

        }

    }
}