import java.util.HashSet;
import java.util.ArrayList;
public class Duplicate3 {
    public static void main(String[]args){

        ArrayList<Integer> num=new ArrayList<>();
        HashSet<Integer> unique=new HashSet<>();
    


        num.add(12);
        num.add(23);
        num.add(28);
        num.add(5);
        num.add(75);
        num.add(22);


      ArrayList<Integer> num1=new ArrayList<>();

        num1.add(5);
        num1.add(75);
        num1.add(22);
        num1.add(38);
        num1.add(90);
        num1.add(64);



        for (int i:num){
            if(num.contains(num1)){
                System.out.println(num1);
            }

           
        }
    
     
    }
    
}

