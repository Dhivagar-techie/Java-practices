import java.util.ArrayList;
public class LArgest {
    public static void main(String[]args){
        ArrayList<Integer> num=new ArrayList<Integer>();
       num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);

        int largest=num.get(0);
     
          for (int i=0;i<num.size();i++){
            if (num.get(i)>largest){
                largest=num.get(i);
            }

            
          }
           System.out.println("largest "+largest);

    }
    
}
