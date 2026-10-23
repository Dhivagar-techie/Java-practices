//Find a missing number from 1 to N.

import java.util.*;

public class pract64 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        

        int[] arr = { 1,2,3,4,5,7,8,9 };

        System.out.println("enter the number: ");
       int n=arr.length+1;



        int whole=n*(n+1)/2;

        int sum=0;

        for (int i=0;i<arr.length;i++){

            sum=sum+arr[i];

        }

        int ans=whole-sum;

        System.out.println(ans+"  this the missing number" );



    }
}
    

