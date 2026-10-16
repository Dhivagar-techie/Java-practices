import java.util.*;
public class TEst4 {
    public static void main(String[] args) {
        Integer[]arr={12,456,89,23,57,89,35,80,235,6,42,73};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));

        for(int i=0;i<num.size()-1;i++){
            for(int j=0;j<num.size()-i-1;j++){
                if(num.get(j)>num.get(j+1)){
                   int temp=num.get(j);
                   num.set(j,num.get(j+1));
                   num.set(j+1,temp);

                }
            }
        }
        System.out.println(num);
    }
    
}
