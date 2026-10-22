//Check whether a number is a magic number.

import java.util.*;

public class pract39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");

        int num = sc.nextInt();

        int temp = num;

        while (temp>0) {

            int sum = 0;

            while (temp > 0) {

                 int save = temp % 10;

                 sum=sum+save;

                 temp=temp/10;

            }

            temp=sum;

        }

        if(temp==1){
            System.out.println("it is a perfect number");

        }
        else{
            System.out.println("it is not");
        }

    }
}
