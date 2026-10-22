//Find the largest factor excluding the number itself.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class pract11 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number :");
        int num=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();

         for(int i=1;i<=num;i++){
            if(num%i==0){
                arr.add(i);
            }
    }
    Collections.reverse(arr);
    System.out.println("no of factors are : "+arr.get(1));
}
}