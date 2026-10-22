//Print the multiplication table of N.

import java.util.*;
public class pract50 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();

        System.out.println("the multiplication table ");

        for(int j=1;j<=num;j++){

        for (int i=1;i<=10;i++){
            System.out.println(i+" x "+j+" = "+i*j);

        }
        System.out.println();

    }

    }
}