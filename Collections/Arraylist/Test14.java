import java.util.*;
public class Test14 {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> num2=new ArrayList<>(Arrays.asList(4,5,6,8));
        ArrayList<Integer> dupli=new ArrayList<>();

        for (int i=0;i<num1.size();i++){
             for (int j=0;j<num2.size();j++){
              
          if(num1.get(i).equals(num2.get(j))){
            dupli.add(num1.get(i));
            break;
          }



             }
        }
        System.out.println(dupli);
    }
    
}
