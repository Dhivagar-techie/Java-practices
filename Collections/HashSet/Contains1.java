import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class Contains1 {
    public static void main(String[] args) {
        
     var num=new ArrayList<Integer>();
    
        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);
        num.add(75);
        num.add(22);

        
        

      System.out.println(num.contains(75));
      System.out.println(num.contains(5));
      System.out.println(num.contains(22));
      System.out.println(num.contains(85));
        
    }
    
}
