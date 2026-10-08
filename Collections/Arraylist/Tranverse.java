import java.util.ArrayList;
public class Tranverse {
    public static void main(String[]args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(23);
        num.add(75);
        num.add(22);
        num.add(28);
        num.add(5);

        for (int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }

    }
    
}
