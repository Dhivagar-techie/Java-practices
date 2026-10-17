import java.util.*;
public class Test11 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2, 4, 3, 8, 9, 7,4, 3, 8, 9));

        for (int i=0;i<num.size();i++){
          int count=0;
            for(int j=0;j<num.size();j++){

                if(num.get(i).equals(num.get(j))){
                    count++;
                }
            }
              if(count==1){
            System.out.println(num.get(i)+" is the appeard once ");
            break;
        }

        }
      

    }}