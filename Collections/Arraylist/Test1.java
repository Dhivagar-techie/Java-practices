import java.util.*;
public class Test1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Integer[]arr={12,456,89,23,57,89,35,80,235,6,42,73};
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> dupli=new ArrayList<>();
        
      for (int i=num.size()-1;i>=0;i--){
        dupli.add(num.get(i));


      }
      System.out.println(dupli);       
    }
    
}
