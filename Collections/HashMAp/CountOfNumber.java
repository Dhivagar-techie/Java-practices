import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;




public class CountOfNumber {
    public static void main(String[] args) {
        
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(10,34,56,83,95,41,9,4,56,83,95));
    
        HashMap<Integer,Integer> num1=new HashMap<>();

        for(int i:num){
            num1.put(i,num1.getOrDefault(i,0)+1);
        }

        System.out.println(num1);
   
        }

    
}
