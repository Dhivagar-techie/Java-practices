import java.util.ArrayList;
public class SumOfArray {
    public static void main(String []args){
        ArrayList<Integer> num =new ArrayList<Integer>();
        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);
  
        int sum=0;

        for (int i=0;i<num.size();i++){
            sum=sum+num.get(i);
        }

        System.out.println("sum "+sum);


    }
}
