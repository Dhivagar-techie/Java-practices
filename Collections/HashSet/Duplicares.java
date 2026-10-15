import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public class Duplicares {
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

        
        

      var dupli=new HashSet<Integer>(num);

      System.out.println(dupli);
        
    }
    
}
