import java.util.ArrayList;
import java.util.Collections;
public class Duplicate2 {
    public static void main(String[]args){

        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> unique=new ArrayList<>();


        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);
        num.add(75);
        num.add(22);

        Collections.sort(num);
        

        for (int i=0;i<num.size();i++){
            for(int j=i+1;i<num.size();i++){

                if (num.get(i).equals(num.get(j))){
                    continue;
            
            }
            else{
                unique.add(i);
            }
        }
        System.out.println(unique);
    }
    }
    
}

