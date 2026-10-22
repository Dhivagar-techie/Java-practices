//Sort the digits of a number.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pract35 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number: ");
        int num=sc.nextInt();

        String str=String.valueOf(num);

        ArrayList<Integer> store=new ArrayList<>();


        for(int i=0;i<str.length();i++){

            store.add(Character.getNumericValue(str.charAt(i)));


        }


        Collections.sort(store);


        
       for(int j=1;j<=store.size();j++){
        System.out.print(j+" ");
       }

    }
    
}
