import java.util.*;
public class Test2 {
    public static void main(String[] args) {

        Integer[]arr={12,456,89,23,57,89,35,80,235,6,42,73};
        
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> dupli=new ArrayList<>();
        ArrayList<Integer> duplicate=new ArrayList<>();

        for(int i:num){
            if(!dupli.contains(i)){
                dupli.add(i);

            }
            else{
                duplicate.add(i);
            }
        }
        System.out.println(dupli);
        System.out.println(duplicate);

    }
    
}
