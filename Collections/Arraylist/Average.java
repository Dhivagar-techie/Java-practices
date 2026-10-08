import java.util.ArrayList;
public class Average {
    public static void main(String[]args){

        ArrayList<Integer> num=new ArrayList<Integer>();
     
        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);

        double sum=0;
    
        for (int i=0;i<num.size();i++){
            
            sum=sum+num.get(i);
        }

         double Avarage =sum/num.size();
       System.out.println(Avarage+" is the value");
    }
    
}
