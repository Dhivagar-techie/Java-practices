import java.util.*;
public class Test6 {
    public static void main(String[] args) {
         Integer[]arr={12,456,89,23,57,89,35,80,235,6,42,73};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> odd=new ArrayList<>();

        for(int i:num){
            if(i%2==1){
                odd.add(i);

            }
        }
        System.out.println(odd);
    }
    
}
