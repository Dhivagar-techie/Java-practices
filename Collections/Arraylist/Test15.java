import java.util.*;
public class Test15 {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> num2=new ArrayList<>(Arrays.asList(10,12,13,14,15,16,17,8,9));
        HashSet<Integer> res=new HashSet<>();

         res.addAll(num1);
         res.addAll(num2);

         System.out.println(res);
    }
    
}
