import java.util.*;
public class Test7 {
    public static void main(String[] args) {
         Integer[]arr={12,456,89,23,57,89,35,80,235,6,42,73};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));
     

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i:num){
            if(first<i){
                third=second;
                second=first;
                first=i;
            }
            else if(second<i){
                third=second;
                second=i;
            }
            else{
                third=i;
            }
        }
       System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }

    
    
}
