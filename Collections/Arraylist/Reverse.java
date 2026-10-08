import java.util.ArrayList;
import java.util.Collections;
public class Reverse {
    public static void main(String[]args){

        ArrayList<Integer> num=new ArrayList<Integer>();

        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);

        Collections.sort(num);

        Collections.reverse(num);

        System.out.println(num);

    }
    
}
