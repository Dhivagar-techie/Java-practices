import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 6, -2, 8, 9, 7));
        int target = 7;
        
        for (int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                if(num.get(i)+num.get(j)==target){
                    System.out.println(num.get(i)+"+"+num.get(j));
                }
            }
        }

    }
}