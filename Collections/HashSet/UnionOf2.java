import java.util.ArrayList;
import java.util.HashSet;
public class UnionOf2 {
    public static void main(String[] args) {
        var num1=new HashSet<Integer>();
        var num2=new HashSet<Integer>();

        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);

         num2.add(4);
         num2.add(5);
         num2.add(6);
         num2.add(7);
         num2.add(8);
         num2.add(9);

         num1.addAll(num2);

    System.out.println("union :"+num1);

    num1.retainAll(num2);
     System.out.println("Intersion :"+num1);

    }
    
}
