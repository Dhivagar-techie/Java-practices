import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> cars= new ArrayList<>();
        cars.add("volvo");
        cars.add("BmW");
        cars.add("vovo");
        cars.add("Ferrai");

        Collections.sort(cars);
         
       for (String i: cars){

        System.out.println(i);

       }

  
        }
    
}
//