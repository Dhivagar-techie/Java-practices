import java.util.*;
public class Test7 {
    public static void main(String[] args) {
         Integer[]arr={12,0,89,23,0,89,35,0,0,6,42,73};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));

      int index=0;

        for(int i=0;i<num.size();i++){
            if(num.get(i)!=0){
                num.set(index,num.get(i));
                index++;

            }
        }
            while (index<num.size()) {
                num.set(index,0);
                index++;
            }

            System.out.println(num);
        }
    }
