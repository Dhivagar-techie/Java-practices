import java.util.*;
public class TEst3 {
    public static void main(String[]args){

        Integer[]arr={12,456,89,23,57,89,35,23,57,8};

        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));
        HashMap<Integer,Integer> dupli=new HashMap<>();

        for(int i:num){
            dupli.put(i,dupli.getOrDefault(i,0)+1);
        }
System.out.println(dupli);
    }

    
}
