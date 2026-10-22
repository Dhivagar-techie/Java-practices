//Find the first digit of a number.
import java.util.ArrayList;
import java.util.Scanner;

public class pract26 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        String str=String.valueOf(num);

        ArrayList<Integer> numbers=new ArrayList<>();
        
        for(int i=0;i<str.length();i++){
             char strings=str.charAt(i);
             int digit=Character.getNumericValue(strings);
             numbers.add(digit);
        }

        System.out.println(numbers.get(0));
        

    }
}