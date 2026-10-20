import java.util.ArrayList;
import java.util.Scanner;

public class pract26 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int num=sc.nextInt();

        ArrayList<Integer> numbers=new ArrayList<>();
        
        for(int i=0;i<num.length();i++){
             numbers.add(num.get(i));
        }

        System.out.println(numbers);
        

    }
}